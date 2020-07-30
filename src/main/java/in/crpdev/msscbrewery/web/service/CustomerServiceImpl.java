package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.service
 **/

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name("Rajapandian")
                .build();
    }
}
