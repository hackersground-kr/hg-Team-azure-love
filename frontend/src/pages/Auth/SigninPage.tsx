import { ColumnFlexBox } from '@/components/styled';
import { AuthField, AuthFieldBackground } from '@/pages/Auth/styled';
import Box from '@mui/material/Box';
import { FinalButton } from '@/pages/Post/styled';
import back from '/back.svg';
import IconButton from '@mui/material/IconButton';
import { useNavigate } from 'react-router-dom';
import SigninRequest from '@/types/request/SigninRequest';
import { useState } from 'react';
import { BASE_URL } from '@/config';
import axios, { request } from 'axios';
import Button from '@mui/material/Button';

function SigninPage() {
  const navigate = useNavigate();

  const [ phoneNumber, setPhone ] = useState('');
  const [ password, setPassword ] = useState('');

  function signin(request: SigninRequest) {
    axios.post(`${BASE_URL}/auth/sign-in`, request).then((res) => {
      localStorage.setItem('user', JSON.stringify(res.data));
      navigate('/');
    });
  }

  return (
    <ColumnFlexBox padding="5%" marginTop="10%">
      <IconButton
        style={{ position: 'fixed', top: 20, left: 20 }}
        onClick={() => {
          navigate('/');
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
          <AuthField placeholder={'등록한 전화번호를 입력해주세요'} value={phoneNumber} onChange={(e) => setPhone(e.target.value)} />
        </AuthFieldBackground>

        <AuthFieldBackground>
          <AuthField placeholder={'비밀번호를 입력해주세요'} value={password} onChange={(e) => setPassword(e.target.value)} />
        </AuthFieldBackground>
      </Box>

      <FinalButton
        onClick={() => signin({ phoneNumber: phoneNumber, password: password })}
      >
        로그인
      </FinalButton>

        <Button style={{ position: 'fixed', bottom: '5px', fontFamily: 'Pretendard', fontSize: '14px', fontWeight: '500', color: '#00AF20',  alignSelf: 'center', }}
                onClick={() => {
                  navigate('/signup');
                }} >
          계정이 없으시다면? 회원가입 하러가기
        </Button>
    </ColumnFlexBox>
  );
}

export default SigninPage;
