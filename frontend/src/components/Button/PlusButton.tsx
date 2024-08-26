import { PlusButtonStyle } from '@/components/Button/styled';
import plus from '/plus.svg';

function PlusButton() {
  return (
    <PlusButtonStyle
      onClick={() => {
        console.log('button clicked');
      }}
    >
      <img src={plus} alt="plus" />
    </PlusButtonStyle>
  );
}

export default PlusButton;
