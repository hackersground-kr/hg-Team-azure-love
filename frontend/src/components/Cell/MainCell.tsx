import { BadgeList, MainRow, MainCellBox, MainImg, RegionText, TitleText } from './styled';
import NanuriBadge from '@/components/Badge';
import { MainCellProps } from '@/components/Cell/types';

function MainCell({ imgUrl, title, region, badges = [] }: MainCellProps) {
  return (
    <MainCellBox>
      <MainRow>
        <MainImg src={new URL(imgUrl ?? '', import.meta.url).href} alt="MainImage" />

        <BadgeList>
          {badges.map((badge, index) => (
            <NanuriBadge key={index} content={badge.content} imgSrc={badge.imgSrc} />
          ))}
        </BadgeList>
      </MainRow>

      <RegionText> {region}</RegionText>

      <TitleText>{title}</TitleText>
    </MainCellBox>
  );
}

export default MainCell;
