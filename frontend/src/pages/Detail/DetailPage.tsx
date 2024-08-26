import { ColumnFlexBox } from '@/components/styled';
import { DetailContent, DetailImg, DetailRegion, DetailTitle } from '@/pages/Detail/styled';
import Box from '@mui/material/Box';

function DetailPage() {
  return (
    <ColumnFlexBox style={{ alignItems: 'center' }}>
      <DetailImg
        src={
          new URL(
            'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzWaHRKYynnJJvBanWuAVxpma7c3USTWu7WQ&s',
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
        <DetailTitle>의성식 성능좋은 상추겉절이</DetailTitle>

        <DetailRegion>경북 의성군</DetailRegion>
      </Box>

      <DetailContent>상추겉절이 입니다.</DetailContent>
    </ColumnFlexBox>
  );
}

export default DetailPage;
