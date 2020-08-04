package in.crpdev.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.crpdev.msscbrewery.web.model.BeerDto;
import in.crpdev.msscbrewery.web.model.BeerStyle;
import in.crpdev.msscbrewery.web.service.BeerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by rajapandian
 * Date: 04/08/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.controller
 **/
@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BeerService beerService;

    @Autowired
    private ObjectMapper objectMapper;

    BeerDto validBeer;

    @BeforeEach
    void setUp() {
        validBeer = BeerDto.builder()
//                .beerName("Kingfisher")
                .beerStyle(BeerStyle.LAGER)
                .upc(101L)
                .id(UUID.randomUUID())
                .build();
    }

    @Test
    void getBeer() throws Exception {
        given(beerService.getBeer(any(UUID.class))).willReturn(validBeer);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + validBeer.getId().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(validBeer.getId().toString())))
                .andExpect(jsonPath("$.beerName", is("Kingfisher")));
    }

    @Test
    void saveNewBeer() throws Exception {
//given
        BeerDto beerDto = validBeer;
        beerDto.setId(null);
        BeerDto savedDto = BeerDto.builder().id(UUID.randomUUID()).beerName("New Beer").build();
        String beerDtoJson = objectMapper.writeValueAsString(beerDto);

        given(beerService.save(any())).willReturn(savedDto);

        mockMvc.perform(post("/api/v1/beer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateBeer() {
    }

    @Test
    void deleteBeer() {
    }
}
