import { createContext, Fragment, useState } from 'react';
import { BrowserRouter } from 'react-router-dom';

import CssBaseline from '@mui/material/CssBaseline';

import { withErrorHandler } from '@/error-handling';
import AppErrorBoundaryFallback from '@/error-handling/fallbacks/App';
import Pages from '@/routes/Pages';
import Header from '@/sections/Header';
import HotKeys from '@/sections/HotKeys';
import Notifications from '@/sections/Notifications';
import SW from '@/sections/SW';
import TabBar from '@/sections/TabBar';

export const HiddenContext = createContext<React.Dispatch<React.SetStateAction<boolean>>>(
  () => false,
);

function App() {
  const [isHidden, setHidden] = useState<boolean>(false);

  return (
    <HiddenContext.Provider value={setHidden}>
      <Fragment>
        <CssBaseline />
        <Notifications />
        <HotKeys />
        <SW />
        <BrowserRouter>
          <Header isHidden={isHidden} />
          <Pages />
          <TabBar isHidden={isHidden} />
        </BrowserRouter>
      </Fragment>
    </HiddenContext.Provider>
  );
}

export default withErrorHandler(App, AppErrorBoundaryFallback);
