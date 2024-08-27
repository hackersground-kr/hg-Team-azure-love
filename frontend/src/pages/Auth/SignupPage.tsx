import { ColumnFlexBox } from '@/components/styled';
import { useState } from 'react';
import Box from '@mui/material/Box';
import { AuthField, AuthFieldBackground } from '@/pages/Auth/styled';
import { FinalButton } from '@/pages/Post/styled';
import SignupRequest from '@/types/request/SignupRequest';
import axios from 'axios';
import { BASE_URL } from '@/config';
import { useNavigate } from 'react-router-dom';
import back from '/back.svg';
import IconButton from '@mui/material/IconButton';

function SignupPage() {

  const [ phoneNumber, setPhone ] = useState('');
  const [ name, setName ] = useState('');
  const [ password, setPassword ] = useState('');
  const [ passwordCon, setPasswordCon ] = useState('');

  const navigate = useNavigate();
  const geolocation = navigator.geolocation;

  function signup(request: SignupRequest) {
    geolocation.getCurrentPosition((position) => {
      const coords = position.coords;

      request.latitude = coords.latitude;
      request.longitude = coords.longitude;

      axios.post(`${BASE_URL}/auth/sign-up`, request).then(() => {
        navigate('/signin');
      });
    });
  }

  return <ColumnFlexBox  padding="5%" marginTop="5%">
    <IconButton
      style={{ position: 'fixed', top: 20, left: 20 }}
      onClick={() => {
        navigate('/signin');
      }}
    >
      <img src={back} style={{ width: '45px', height: '45px' }} />
    </IconButton>

    <Box
      sx={{
        width: '100%',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'space-between',
      }}
    >
      <div
        style={{
          fontFamily: 'WAGURITTF',
          fontWeight: 'Bold',
          color: '#00AF20',
          fontSize: 42,
        }}
      >
        나누리
      </div>

      <AuthFieldBackground>
        <AuthField placeholder={'이름을 입력해주세요'} value={name} onChange={(e) => setName(e.target.value)} />
      </AuthFieldBackground>

      <AuthFieldBackground>
        <AuthField placeholder={'등록할 전화번호를 입력해주세요'} value={phoneNumber} onChange={(e) => setPhone(e.target.value)} />
      </AuthFieldBackground>

      <AuthFieldBackground>
        <AuthField placeholder={'비밀번호를 입력해주세요'} value={password} onChange={(e) => setPassword(e.target.value)} type={'password'} />
      </AuthFieldBackground>

      <AuthFieldBackground>
        <AuthField placeholder={'비밀번호를 다시 한번 더 입력해주세요'} value={passwordCon} onChange={(e) => setPasswordCon(e.target.value)} type={'password'} />
      </AuthFieldBackground>
    </Box>

    <FinalButton
      onClick={() => signup({ name: name, phoneNumber: phoneNumber, password: password, latitude: 0, longitude: 0 })}
    >
      회원가입
    </FinalButton>
  </ColumnFlexBox>;
}

export default SignupPage;
