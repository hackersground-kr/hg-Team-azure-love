import { ColumnFlexBox } from '@/components/styled';
import { AuthField, AuthFieldBackground } from '@/pages/Auth/styled';
import Box from '@mui/material/Box';
import { FinalButton } from '@/pages/Post/styled';
import back from '/back.svg';
import IconButton from '@mui/material/IconButton';
import { useNavigate } from 'react-router-dom';

function SigninPage() {
  const navigate = useNavigate();

  return (
    <ColumnFlexBox padding='5%' marginTop='10%' >
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
          <AuthField placeholder={'아이디를 입력해주세요'} />
        </AuthFieldBackground>

        <AuthFieldBackground>
          <AuthField placeholder={'비밀번호를 입력해주세요'} />
        </AuthFieldBackground>
      </Box>

      <FinalButton>로그인</FinalButton>
    </ColumnFlexBox>
  );
}

export default SigninPage;
