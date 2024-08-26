import MyPageButton from '@/components/Button/MyPageButton';
import checkmark from '/checkmark.svg';
import menu from '/menu.svg';
import people from '/people.svg';
import { ColumnFlexBox } from '@/components/styled';

function SettingsPage() {
  return (
    <ColumnFlexBox>
      <MyPageButton title={'개인정보 처리방침'} imgSrc={checkmark} />

      <MyPageButton title={'서비스 이용약관'} imgSrc={menu} />

      <MyPageButton title={'만든 이들'} imgSrc={people} />
    </ColumnFlexBox>
  );
}

export default SettingsPage;
