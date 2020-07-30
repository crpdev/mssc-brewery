package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.service
 **/
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer(UUID beerid) {
        return new BeerDto().builder()
                .id(UUID.randomUUID())
                .beerName("Kingfisher")
                .beerStyle("Lehar")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return new BeerDto().builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
//        ToDo - Will be implementing the Logic at a later stage
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer {}: ", beerId);
    }
}
