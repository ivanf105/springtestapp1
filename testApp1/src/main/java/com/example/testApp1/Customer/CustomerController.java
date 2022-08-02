package com.example.testApp1.Customer;

import com.example.testApp1.Orders.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;
    private final OrdersService ordersService;
    @Autowired //dependency injection
    public CustomerController(CustomerService customerService,OrdersService ordersService) {
        this.customerService = customerService;
        this.ordersService=ordersService;
    }

    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }
    @PostMapping
    public void registerNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path="{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id){
        int deleteAllOrders = 1;
        customerService.deleteCustomer(id);
        ordersService.deleteAllCustomerOrder(id);
    }

    @PutMapping(path="{customerId}")
    public void updateCustomer(@PathVariable("customerId") Long id,@RequestParam(required = false) String email){
        customerService.updateCustomer(id,email);
        ordersService.updateOrder(id,null,email);

    }
}
