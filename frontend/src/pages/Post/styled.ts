import { styled } from '@mui/material/styles';
import { InputBase } from '@mui/material';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';

const FieldTitle = styled(Typography)({
  fontFamily: 'Pretendard',
  fontWeight: 'bold',
  fontSize: '24px',
  marginTop: '24px',
  marginBottom: '12px',
  color: '#3C3C3C',
});

const FieldBackground = styled('div')({
  flexGrow: 1,
  display: 'flex',
  width: '80vw',
  borderRadius: '12px',
  border: '1px solid #00AF20',
});

const TitleField = styled(InputBase)({
  fontFamily: 'Pretendard',
  fontSize: '24px',
  fontWeight: 'bold',
  flexGrow: 1,
  padding: '16px',
});

const ContentField = styled(InputBase)({
  fontFamily: 'Pretendard',
  fontSize: '20px',
  fontWeight: '500',
  flexGrow: 1,
  border: 'none',
  padding: '16px',
});

const FinalButton = styled(Button)({
  position: 'fixed',
  padding: '16px',
  margin: '20px',
  width: '80%',
  bottom: '20px',
  alignSelf: 'center',
  backgroundColor: '#00AF20',
  '&:hover': {
    backgroundColor: '#45a049',
  },
  borderRadius: '12px',
  color: 'white',
  fontFamily: 'Pretendard',
  fontSize: '16px',
  fontWeight: 'bold',
});

export { FieldTitle, FieldBackground, TitleField, ContentField, FinalButton };
