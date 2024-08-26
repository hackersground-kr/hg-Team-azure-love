import { styled } from '@mui/material/styles';
import Typography from '@mui/material/Typography';

const MyPageTitle = styled(Typography)({
  fontFamily: 'Pretendard',
  fontWeight: 'bold',
  fontSize: '42px',
  color: '#3C3C3C',
});

const MyPageRegion = styled(Typography)({
  fontFamily: 'Pretendard',
  fontWeight: '500',
  fontSize: '14px',
  color: '#00AF20',
  marginLeft: '6px',
});

export { MyPageTitle, MyPageRegion };
