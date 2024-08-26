import Box from '@mui/material/Box';
import { AppBar, InputBase, IconButton, styled } from '@mui/material';

const FlexBox = styled(Box)({
  display: 'flex',
});

const CenteredFlexBox = styled(FlexBox)({
  justifyContent: 'center',
  alignItems: 'center',
});

const FullSizeCenteredFlexBox = styled(CenteredFlexBox)({
  width: '100%',
  height: '100%',
});

const ColumnFlexBox = styled(FlexBox)({
  display: 'flex',
  alignItems: 'start',
  width: '100%',
  height: '100%',
  flexDirection: 'column',
})

const Badge = styled(Box)({
  fontFamily: 'Pretendard',
  fontWeight: 'bold',
  fontSize: '14px',
  color: '#1AB736',
  padding: '4px 10px',
  backgroundColor: '#E5F7E9',
  borderRadius: '8px',
  display: 'flex',
  alignItems: 'center',
  margin: '8px 0px',
  width: 'fit-content',
});

const BadgeImg = styled('img')({
  width: '20px',
  height: '20px',
  marginRight: '8px',
});


const StyledAppBar = styled(AppBar)({
  backgroundColor: 'white',
  boxShadow: 'none',
});

const LogoButton = styled(IconButton)({
  marginRight: '16px',
});

const SearchBar = styled('div')({
  flexGrow: 1,
  display: 'flex',
  alignItems: 'center',
  backgroundColor: '#f0f0f0',
  borderRadius: '53px',
  padding: '2px 16px',
});

const StyledInputBase = styled(InputBase)({
  fontFamily: 'Pretendard',
  fontWeight: 'Regular',
  fontSize: '14px',
  color: '#232323',
  marginRight: '8px',
  flexGrow: 1,
  '& .MuiInputBase-input': {
    padding: '8px 0',
  },
});

const SearchButton = styled(IconButton)({
  fontFamily: 'Pretendard',
  fontWeight: 'bold',
  fontSize: '16px',
  backgroundColor: '#4DC763',
  color: 'white',
  borderRadius: '55px',
  padding: '15px 21px',
  marginRight: '-12px',
  '&:hover': {
    backgroundColor: '#45a049',
  },
});



export { FlexBox, CenteredFlexBox, FullSizeCenteredFlexBox, ColumnFlexBox, Badge, BadgeImg, StyledAppBar, LogoButton, SearchBar, StyledInputBase, SearchButton };
