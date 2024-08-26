import { styled } from '@mui/material/styles';
import { InputBase } from '@mui/material';
import { FieldBackground } from '@/pages/Post/styled';

const AuthFieldBackground = styled(FieldBackground)({
  margin: '8px auto',
});

const AuthField = styled(InputBase)({
  flexGrow: 1,
  padding: '12px',
  fontFamily: 'Pretendard',
  fontSize: '20px',
  fontWeight: '500',
});

export { AuthFieldBackground, AuthField };
