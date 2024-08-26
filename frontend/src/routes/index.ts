import asyncComponentLoader from '@/utils/loader';

import { Pages, Routes } from './types';

const routes: Routes = {
  [Pages.Welcome]: {
    component: asyncComponentLoader(() => import('@/pages/Welcome')),
    path: '/',
    title: 'Welcome',
  },
  [Pages.Home]: {
    component: asyncComponentLoader(() => import('@/pages/Home')),
    path: '/home',
    title: 'Home',
  },
  [Pages.My]: {
    component: asyncComponentLoader(() => import('@/pages/My')),
    path: '/my',
    title: 'My',
  },
  [Pages.Settings]: {
    component: asyncComponentLoader(() => import('@/pages/Settings')),
    path: '/settings',
    title: 'Settings',
  },
  [Pages.Post]: {
    component: asyncComponentLoader(() => import('@/pages/Post')),
    path: '/post',
    title: 'Post',
  },
  [Pages.Detail]: {
    component: asyncComponentLoader(() => import('@/pages/Detail')),
    path: '/detail',
    title: 'Detail',
  },
  [Pages.Signup]: {
    component: asyncComponentLoader(() => import('@/pages/Auth/SignupPage')),
    path: '/signup',
    title: 'Signup',
  },
  [Pages.Signin]: {
    component: asyncComponentLoader(() => import('@/pages/Auth/SigninPage')),
    path: '/signin',
    title: 'Signin',
  },
  [Pages.NotFound]: {
    component: asyncComponentLoader(() => import('@/pages/NotFound')),
    path: '*',
  },
};

export default routes;
