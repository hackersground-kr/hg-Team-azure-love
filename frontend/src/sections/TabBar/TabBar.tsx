import Box from '@mui/material/Box';
import TabItem from '@/sections/TabBar/Item/TabItem';
import home from '/home.svg';
import profile from '/profile.svg';
import setting from '/setting.svg';

function TabBar(props: { isHidden: boolean }) {
  return (
    <Box
      sx={{
        flexGrow: 1,
        position: 'fixed',
        bottom: 0,
        zIndex: 1,
        background: '#f6f6f6',
        width: '100%',
        height: '11%',
        display: props.isHidden ? 'none' : 'flex',
        alignItems: 'center',
        justifyContent: 'space-between',
        padding: '0px 15%',
        borderTopLeftRadius: 35,
        borderTopRightRadius: 35,
        boxShadow: '0 -4px 6px rgba(0, 0, 0, 0.2)', // Add shadow effect
      }}
    >
      <TabItem path={'/home'} imgSrc={home} label={'홈'} />
      <TabItem path={'/my'} imgSrc={profile} label={'내 정보'} />
      <TabItem path={'/settings'} imgSrc={setting} label={'설정'} />
    </Box>
  );
}

export default TabBar;
