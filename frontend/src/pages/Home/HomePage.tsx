import { ColumnFlexBox } from '@/components/styled';
import share from '/public/share.svg';
import logo from '/plant.svg'
import MainCell from '@/components/Cell/MainCell';
import NanuriDevider from '@/components/Devider/NanuriDevider';
import PlusButton from '@/components/Button/PlusButton';
import Box from '@mui/material/Box';
import { Link, useNavigate } from 'react-router-dom';
import { ButtonBase } from '@mui/material';
import { useEffect } from 'react';
import client from '@/config/client';

function HomePage() {
  const list = Array.from({ length: 10 }).map((_, i) => i);
  const navigate = useNavigate();


  useEffect(() => {
    client.get(`/post`).then((res) => res.data)
      .then((result) => console.log(result));
  }, []);

  return (
    <>
      <ColumnFlexBox>
        <Box style={{ paddingBottom: 60, paddingTop: 20 }}>
          {list.map((index) => {
            return (
              <Box key={index} style={{ paddingBottom: 50, paddingTop: 10 }}>
                <ButtonBase component={Link} to="/detail">
                  <MainCell
                    title={'요즘 잠이 잘 안 오시는 분들께, 상추 3봉 나눔합니다'}
                    region={'경상북도 의성군'}
                    badges={[
                      { content: '나눔', imgSrc: share },
                      { content: '잉여농산물', imgSrc: logo },
                    ]}
                    imgUrl={
                      index == 0 ? 'https://health.chosun.com/site/data/img_dir/2023/06/07/2023060701939_0.jpg'
                        : 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSl-Yi6Rw_IHb5iUTxkAhDYidsAVeeCenJ0sQ&s'
                    }
                  />
                </ButtonBase>
                <NanuriDevider />
              </Box>
            );
          })}
        </Box>

        <PlusButton
          onClick={() => {
            navigate('/post');
          }}
        />
      </ColumnFlexBox>
    </>
  );
}

export default HomePage;
