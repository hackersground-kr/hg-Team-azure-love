import { MyPageButtonImg, MyPageButtonStyle } from '@/components/Button/styled';
import { MyPageButtonProps } from '@/components/Button/types';

function MyPageButton(props: MyPageButtonProps) {
  return (
    <MyPageButtonStyle
      onClick={props.onClick}
      style={{ color: props.destructive ? '#E61111' : '#3C3C3C' }}
    >
      <MyPageButtonImg src={props.imgSrc} />

      {props.title}
    </MyPageButtonStyle>
  );
}

export default MyPageButton;
