import { styled } from '@mui/material/styles';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';

const TabItemStyle = styled(Button)({
  margin: '10px 0px',
  display: 'flex',
  flexDirection: 'column',
  alignItems: 'center',
  paddingBottom: '15px',
  marginTop: '8px',
});

const TabItemImg = styled('img')({
  width: '30px',
  height: '30px',
  marginBottom: '8px',
});

const TabItemText = styled(Typography)({
  fontFamily: 'Pretendard',
  fontSize: '12px',
  fontWeight: '500',
  color: '#1B1B1B',
});

export { TabItemStyle, TabItemImg, TabItemText };
