package top.igio.springbootBorrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.igio.springbootBorrow.entity.Customer;
import top.igio.springbootBorrow.mapper.CustomerMapper;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;


    @GetMapping("/{customerId}")
    public Customer selectById(@PathVariable("customerId") long customerId){
        return customerMapper.findById(customerId);
    }

    @GetMapping("/a/{customerId}")
    public Customer getAccount(@PathVariable("customerId") long customerId) {
        return customerMapper.getCustomerAndAccount(customerId);
    }

    @GetMapping("/all")
    public List<Customer> getCustomer() {
        List<Customer> customers = customerMapper.getCustomerList();
        return customers;
    }

    @PostMapping("/add")
    public String insertCustomer(@RequestBody Customer customer) {
        customerMapper.insertAll(customer);
        if(customer.getCustomerId() != null) {
            return "success";
        } else {
            return "false";
        }
    }

    @PutMapping("/delete/{customerId}")
    public String deleteById(@PathVariable("customerId") long customerId) {
        customerMapper.deleteById(customerId);
        if(customerMapper.findById(customerId) != null) {
            return "false";
        } else {
            return "success";
        }
    }

    @PutMapping
    public String updateById(@RequestBody Customer customer) {
        customerMapper.updateById(customer);
        return "ok";
    }

}
