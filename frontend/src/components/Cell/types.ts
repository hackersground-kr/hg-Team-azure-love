import { BadgeProps } from '@/components/Badge/types';

type MainCellProps = {
  imgUrl?: string;
  title: string;
  region: string;
  badges?: BadgeProps[];
}

export type { MainCellProps };