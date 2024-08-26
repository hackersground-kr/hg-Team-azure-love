import { styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';

const MainCellBox = styled(Box)({
  fontFamily: 'Pretendard',
  position: 'relative',
  alignItems: 'center',
  margin: '12px 20px',
});

const MainRow = styled(Box)({
  display: 'flex',
  flexDirection: 'row',
});

const BadgeList = styled(Box)({
  position: 'relative',
  height: '100%',
  paddingLeft: '12px',
});

const MainImg = styled('img')({
  marginBottom: '10px',
  width: '70%',
  borderRadius: '12px',
});

const TitleText = styled('div')({
  fontFamily: 'Pretendard',
  fontSize: '20px',
  fontWeight: 'bold',
  color: '#3C3C3C',
  marginTop: '7px',
});

const RegionText = styled('div')({
  fontFamily: 'Pretendard',
  fontWeight: '500',
  fontSize: '14px',
  color: '#7C7C7C',
  paddingTop: '5px',
});

const MyEditCellBox = styled(Box)({
  position: 'relative',
  display: 'flex',
  flexDirection: 'column',
  alignItems: 'center',
  margin: '24px',
});

const MyEditPlaceholder = styled('img')({
  width: '120px',
  height: '120px',
  objectFit: 'cover',
  padding: '15px',
  backgroundColor: '#E7E7E7',
  borderRadius: '100%',
});

const MyEditBtn = styled(Button)({
  color: '#00AF20',
  width: 'fit-content',
});

export {
  MainCellBox,
  MainRow,
  BadgeList,
  MainImg,
  TitleText,
  RegionText,
  MyEditCellBox,
  MyEditPlaceholder,
  MyEditBtn,
};
