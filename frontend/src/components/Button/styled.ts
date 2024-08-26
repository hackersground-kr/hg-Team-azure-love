import { styled } from '@mui/material/styles';
import IconButton from '@mui/material/IconButton';
import Button from '@mui/material/Button';

const PlusButtonStyle = styled(IconButton)({
  border: 'none',
  backgroundColor: '#33BF4D',
  borderRadius: '100px',
  position: 'fixed',
  padding: '15px',
  margin: 0,
  bottom: '110px',
  right: '18px',
  cursor: 'pointer',
  transition: '0.2s',
  '&:hover': {
    backgroundColor: '#45a049', // Accent Color
  },
});

const MyPageButtonImg = styled('img')({
  width: '35px',
  height: '35px',
  marginRight: '8px',
  fill: '#00AF20',
});

const MyPageButtonStyle = styled(Button)({
  fontFamily: 'Pretendard',
  fontWeight: 'bold',
  fontSize: '20px',
  margin: '16px 0px 16px 28px',
});

export { PlusButtonStyle, MyPageButtonImg, MyPageButtonStyle };
