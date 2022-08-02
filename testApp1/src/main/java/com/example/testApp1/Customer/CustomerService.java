package com.example.testApp1.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired  //dependency injection for customerRepository
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository= customerRepository;
    }

    public List<Customer> getCustomer(){
        //returns list of db records
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        System.out.println(customer);
        customerRepository.save(customer);
      }

    public void deleteCustomer(Long id) {
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
        }
     }
    @Transactional//allows setters and getters to update/get data in db
    public void updateCustomer(Long id,String email) {
        //setting customer object to record matching id in db if customer exists
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new IllegalStateException("id"));//have to put orElseThrow to work
        if(customerRepository.existsById(id)){
            System.out.println("Old email: "+ customer.getEmail());
           customer.setEmail(email);
           customer.setState(email);
        }
    }
}
