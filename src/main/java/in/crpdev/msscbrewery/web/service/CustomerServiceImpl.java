package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.CustomerDto;
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
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name("Rajapandian")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomerDetails(UUID customerId, CustomerDto customerDto) {
        log.debug("Customer {} details has been updated.", customerDto.getName());
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Customer {} has been deleted from the system.", customerId);
    }
}
