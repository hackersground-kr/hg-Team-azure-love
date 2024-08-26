import { FC } from 'react';
import { PathRouteProps } from 'react-router-dom';

enum Pages {
  Welcome,
  Home,
  My,
  Settings,
  Post,
  Detail,
  Signup,
  Signin,
  NotFound,
}

type PathRouteCustomProps = {
  title?: string;
  component: FC;
};

type Routes = Record<Pages, PathRouteProps & PathRouteCustomProps>;

export type { Routes };
export { Pages };
