package com.tanvi.demo.service;



import com.tanvi.demo.dto.CustomerRequest;
import com.tanvi.demo.entity.Customer;
import com.tanvi.demo.mapper.CustomerMapper;
import com.tanvi.demo.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }
}