import React from 'react';
import { Link as RouterLink } from 'react-router-dom';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import IconButton, { IconButtonProps } from '@mui/material/IconButton';
import Toolbar from '@mui/material/Toolbar';
import useMediaQuery from '@mui/material/useMediaQuery';
import { useTheme as useMuiTheme, styled } from '@mui/material/styles';
import Logo from '../../../public/favicon.svg';

import { FlexBox, StyledAppBar, StyledInputBase, SearchBar, SearchButton } from '@/components/styled';
import { title } from '@/config';
import useNotifications from '@/store/notifications';
import useCustomTheme from '@/store/theme';

import { getRandomJoke } from './utils';
import '@/Font.css'

// Logo 컴포넌트 정의
// LogoButton 컴포넌트 정의
const LogoButton = styled(IconButton)<IconButtonProps & { component?: typeof RouterLink; to?: string; }>({
  paddingRight: '8px',
});

function Header() {
  const [ theme ] = useCustomTheme();
  const [, notificationsActions] = useNotifications();
  const muiTheme = useMuiTheme();
  const isMobile = useMediaQuery(muiTheme.breakpoints.down('sm'));

  function showNotification() {
    notificationsActions.push({
      options: {
        variant: 'customNotification',
      },
      message: getRandomJoke(),
    });
  }

  const DesktopHeader = () => (
    <Toolbar sx={{ justifyContent: 'space-between'}}>
      <FlexBox sx={{ alignItems: 'center' }}>
        <Button onClick={showNotification} style={{ fontFamily: 'WAGURITTF', fontWeight: 'Bold', color: '#00AF20', fontSize: 42, paddingTop: 30}}>
          {title}
        </Button>
      </FlexBox>
    </Toolbar>
  );

  const MobileHeader = () => (
    <StyledAppBar position="static">
      <Toolbar>
        <LogoButton
          component={RouterLink}
          to="/home"
          edge="start"
          color="inherit"
        >
          <img src={Logo} width={75} height={75} />
        </LogoButton>
        <SearchBar>
          <StyledInputBase
            placeholder="필요한 농산물이 있으신가요?"
            inputProps={{ 'aria-label': 'search' }}
          />
          <SearchButton>
            검색
          </SearchButton>
        </SearchBar>
      </Toolbar>
    </StyledAppBar>
  );

  return (
    <Box sx={{ flexGrow: 1, position: 'sticky', top: 0, zIndex: 1, background: '#ffffff' }} data-pw={`theme-${theme}`}>
      {isMobile ? <MobileHeader /> : <DesktopHeader />}
    </Box>
  );
}

export default Header;