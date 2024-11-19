package com.tanvi.yummyproject.mapper;


import com.tanvi.yummyproject.dto.CustomerRequest;
import com.tanvi.yummyproject.dto.CustomerResponse;
import com.tanvi.yummyproject.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request,String encryptedPassword) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(encryptedPassword)
                .pass(request.password())
                .build();
    }
    public CustomerResponse toCustomerResponse(Customer customer) {
        return new CustomerResponse(customer.getFirstName(), customer.getLastName(), customer.getEmail());
    }
}

