import { styled } from '@mui/material/styles';
import Typography from '@mui/material/Typography';

const DetailImg = styled('img')({
  width: '90%',
  maxWidth: '500px',
  maxHeight: '300px',
  borderRadius: '12px',
});

const DetailTitle = styled(Typography)({
  fontFamily: 'Pretendard',
  fontSize: '24px',
  fontWeight: 'bold',
  color: '#3C3C3C',
});

const DetailRegion = styled(Typography)({
  marginLeft: '20px',
  width: '140px',
  fontFamily: 'Pretendard',
  fontSize: '16px',
  fontWeight: '500',
  color: '#7C7C7C',
});

const DetailContent = styled(Typography)({
  marginTop: '12px',
  fontFamily: 'Pretendard',
  fontSize: '16px',
  fontWeight: '500',
  width: '90%',
});

export { DetailImg, DetailTitle, DetailRegion, DetailContent };
