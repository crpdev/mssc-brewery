package in.crpdev.msscbrewery.web.service;

import in.crpdev.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.service
 **/
public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomerDetails(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
