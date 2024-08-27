import MyEditCell from '@/components/Cell/MyEditCell';
import { ColumnFlexBox } from '@/components/styled';
import { MyPageRegion, MyPageTitle } from '@/pages/My/styled';
import Box from '@mui/material/Box';
import MyPageButton from '@/components/Button/MyPageButton';
import memo from '/memo.svg';
import edit from '/edit.svg';
import logout from '/logout.svg';
import login from '/login.svg';
import { useNavigate } from 'react-router-dom';

function MyPage() {
  const navigate = useNavigate();
  return !(localStorage.getItem('user') === null) ? (
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

      <MyPageButton title={'나누리 로그아웃'} imgSrc={logout} destructive={true} onClick={() => {
        localStorage.removeItem('user');
        window.location.reload();
      }} />
    </ColumnFlexBox>
  ) : (
    <ColumnFlexBox>
      <Box sx={{ margin: '40px 0px 12px 36px', fontFamily: 'Pretendard', fontSize: '24px', fontWeight: '500', whiteSpace: 'pre-wrap' }}>
        내 정보를 불러오기 위해,
        {'\n'}로그인이 필요합니다!
      </Box>

      <MyPageButton title="로그인하기" imgSrc={login} onClick={() => {
        navigate('/signin');
      }}/>
    </ColumnFlexBox>
  );
}

export default MyPage;
