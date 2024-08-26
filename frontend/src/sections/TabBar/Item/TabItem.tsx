import { TabItemImg, TabItemStyle, TabItemText } from './styled';
import { TabItemProps } from '@/sections/TabBar/Item/types';
import { Link } from 'react-router-dom';

function TabItem(props: TabItemProps) {

  const handleClick = () => {
    if (props.onClick) {
      props.onClick();
    }
  };

  return (
    // eslint-disable-next-line @typescript-eslint/ban-ts-comment
    // @ts-expect-error
    <TabItemStyle as={Link} to={props.path} onClick={handleClick}>
      <TabItemImg src={props.imgSrc} alt={props.label} />
      <TabItemText>{props.label}</TabItemText>
    </TabItemStyle>
  );
}

export default TabItem;