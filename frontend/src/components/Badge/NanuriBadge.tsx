import { Badge, BadgeImg } from '@/components/styled';
import { BadgeProps } from './types';


function NanuriBadge(
  props: BadgeProps
) {
  return (
    <Badge>
      < BadgeImg src={props.imgSrc} />

      {props.content}
    </Badge>
  );
}

export default NanuriBadge;