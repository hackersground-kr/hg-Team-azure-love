import { PlusButtonStyle } from '@/components/Button/styled';
import plus from '/plus.svg';

function PlusButton(props: { onClick?: () => void }) {
  return (
    <PlusButtonStyle onClick={props.onClick}>
      <img src={plus} alt="plus" />
    </PlusButtonStyle>
  );
}

export default PlusButton;
