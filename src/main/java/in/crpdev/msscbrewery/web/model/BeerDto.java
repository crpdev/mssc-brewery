package in.crpdev.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
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

    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyle beerStyle;
    @Positive
    private Long upc;
}
