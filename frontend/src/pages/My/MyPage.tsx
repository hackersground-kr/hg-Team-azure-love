import MyEditCell from '@/components/Cell/MyEditCell';
import { ColumnFlexBox } from '@/components/styled';
import { MyPageRegion, MyPageTitle } from '@/pages/My/styled';
import Box from '@mui/material/Box';
import MyPageButton from '@/components/Button/MyPageButton';
import memo from '/memo.svg';
import edit from '/edit.svg';
import logout from '/logout.svg';

function MyPage() {
  return (
    <ColumnFlexBox>
      <Box sx={{ display: 'flex', flexDirection: 'row', alignItems: 'center' }}>
        <MyEditCell />

        <Box
          sx={{
            display: 'flex',
            alignItems: 'start',
            flexDirection: 'column',
            justifyContent: 'space-between',
            marginBottom: '2rem',
          }}
        >
          <MyPageTitle>신민호</MyPageTitle>

          <MyPageRegion>경상북도 의성군</MyPageRegion>
        </Box>
      </Box>

      <MyPageButton title={'내 게시글 보기'} imgSrc={memo} />

      <MyPageButton title={'내 정보 수정하기'} imgSrc={edit} />

      <MyPageButton title={'나누리 로그아웃'} imgSrc={logout} destructive={true} />
    </ColumnFlexBox>
  );
}

export default MyPage;
