import { ColumnFlexBox } from '@/components/styled';
import { DetailContent, DetailImg, DetailRegion, DetailTitle } from '@/pages/Detail/styled';
import Box from '@mui/material/Box';

function DetailPage() {
  return (
    <ColumnFlexBox style={{ alignItems: 'center' }}>
      <DetailImg
        src={
          new URL(
            'https://health.chosun.com/site/data/img_dir/2023/06/07/2023060701939_0.jpg',
          ).href
        }
        alt="DetailImage"
      />

      <Box
        display="flex"
        justifyContent="space-between"
        flexDirection="row"
        width="90%"
        alignItems="center"
        marginTop="12px"
      >
        <DetailTitle>요즘 잠이 잘 안 오시는 분들께, 상추 3봉 나눔합니다</DetailTitle>

        <DetailRegion>경북 의성군</DetailRegion>
      </Box>

      <DetailContent>
        상추는 국화과에 속하는 한해살이 풀이다. 채소식물로 여러 가지 계통·품종군으로 분화되어 있다. 상추는 잎 채소로 가장 자주 많이 사용되는데, 때때로 줄기와 씨앗을 위해 재배되기도 한다. 상추는 수프, 샌드위치와 같은 여러 종류의 음식에서도 볼 수 있지만 샐러드에 가장 많이 사용된다. 상추의 한 품종인 아스파라거스 상추는 줄기를 먹기 위해 키우는데, 줄기는 생으로 먹거나 익혀 먹는다. 또 과거에는 유럽과 북미가 상추 시장을 지배했지만, 20세기 후반부터 상추는 전 세계적으로 퍼지기 시작했다. 2017년 기준 세계 상추와 치커리의 생산량은 2700만톤으로 이 중 56%가 중국산으로 알려져 있다
      </DetailContent>
    </ColumnFlexBox>
  );
}

export default DetailPage;
