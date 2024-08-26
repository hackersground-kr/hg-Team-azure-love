import { ColumnFlexBox } from '@/components/styled';
import IconButton from '@mui/material/IconButton';
import back from '/back.svg';
import { useNavigate } from 'react-router-dom';
import Box from '@mui/material/Box';
import {
  ContentField,
  FieldBackground,
  FieldTitle,
  FinalButton,
  TitleField,
} from '@/pages/Post/styled';

function PostPage() {
  const navigate = useNavigate();

  return (
    <ColumnFlexBox style={{ alignItems: 'center' }}>
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
          position: 'relative',
          display: 'flex',
          flexDirection: 'column',
          marginTop: '80px',
          paddingBottom: '120px',
        }}
      >
        <FieldTitle>제목</FieldTitle>

        <FieldBackground>
          <TitleField placeholder="제목을 입력해주세요" />
        </FieldBackground>

        <FieldTitle>내용</FieldTitle>

        <FieldBackground>
          <ContentField placeholder="내용을 입력해주세요" multiline={true} minRows={2} />
        </FieldBackground>

        <FinalButton>작성 완료</FinalButton>
      </Box>
    </ColumnFlexBox>
  );
}

export default PostPage;
