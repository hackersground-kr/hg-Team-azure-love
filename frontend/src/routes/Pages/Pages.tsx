import { Route, Routes, useLocation } from 'react-router-dom';

import Box from '@mui/material/Box';

import routes from '..';
import { getPageHeight } from './utils';
import { useContext, useEffect } from 'react';
import { HiddenContext } from '@/App';

function Pages() {
  const location = useLocation();
  2;
  const setHidden = useContext(HiddenContext);

  useEffect(() => {
    if (
      location.pathname === '/post' ||
      location.pathname === '/signup' ||
      location.pathname === '/signin'
    ) {
      setHidden(true);
    } else {
      setHidden(false);
    }
  }, [location, setHidden]);

  return (
    <Box sx={{ height: (theme) => getPageHeight(theme) }}>
      <Routes>
        {Object.values(routes).map(({ path, component: Component }) => {
          return <Route key={path} path={path} element={<Component />} />;
        })}
      </Routes>
    </Box>
  );
}

export default Pages;
