package in.crpdev.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 29/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.model
 **/

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;
}
