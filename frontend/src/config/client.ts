import axios from 'axios';
import { BASE_URL } from '@/config/index';

const client = axios.create({
  baseURL: BASE_URL
})

client.interceptors.request.use(
  function (config) {
    const user = localStorage.getItem('user');
    if (!user) {
      return config
    }
    const { accessToken } = JSON.parse(user)
    console.log(accessToken);
    config.headers["Authorization"] = "Bearer " + accessToken;
    return config
  }
)

client.interceptors.response.use(
  function (response) {
    return response
  },
  async function (error) {
    if (error.response && error.response.status === 403) {
      try {
        const { refreshToken } = JSON.parse(localStorage.getItem('user') || "{}");
        const data = await client.post('auth/refresh', { refreshToken: refreshToken });
        if (data) {
          localStorage.removeItem('user');
          localStorage.setItem('user', JSON.stringify(data.data));
          return await client.request(error.config);
        }
      } catch (error){
        localStorage.removeItem('user');
        console.log(error);
      }
      return Promise.reject(error)
    }
    return Promise.reject(error)
  }
)

export default client;