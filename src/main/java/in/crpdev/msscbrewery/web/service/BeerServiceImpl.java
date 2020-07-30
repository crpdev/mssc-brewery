package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.service
 **/
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
}
