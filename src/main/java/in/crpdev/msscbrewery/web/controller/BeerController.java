package in.crpdev.msscbrewery.web.controller;

import in.crpdev.msscbrewery.web.model.BeerDto;
import in.crpdev.msscbrewery.web.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 29/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.controller
 **/
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeer(beerId), HttpStatus.OK);
    }
}
