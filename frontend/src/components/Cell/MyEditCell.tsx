import { MyEditBtn, MyEditCellBox, MyEditPlaceholder } from '@/components/Cell/styled';
import profile from '/profile.svg';

function MyEditCell() {
  return (
    <MyEditCellBox>
      < MyEditPlaceholder src={profile} />

      <MyEditBtn>
        이미지 수정
      </MyEditBtn>

    </MyEditCellBox>
  );
}

export default MyEditCell;