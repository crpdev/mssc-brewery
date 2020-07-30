package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web
 **/
public interface BeerService {
    BeerDto getBeer(UUID beerid);

    BeerDto save(BeerDto beerDto);
}
