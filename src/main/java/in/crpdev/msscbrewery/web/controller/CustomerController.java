package in.crpdev.msscbrewery.web.controller;

import in.crpdev.msscbrewery.web.model.CustomerDto;
import in.crpdev.msscbrewery.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 30/07/20
 * Project: mssc-brewery
 * Package: in.crpdev.msscbrewery.web.controller
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "http://localhost:8080/api/v1/customer/" + savedCustomer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomerDetails(customerId, customerDto);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
    }
}
