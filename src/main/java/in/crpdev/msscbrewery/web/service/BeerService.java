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
    BeerDto getBeer(UUID beerId);

    BeerDto save(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeerById(UUID beerId);
}
