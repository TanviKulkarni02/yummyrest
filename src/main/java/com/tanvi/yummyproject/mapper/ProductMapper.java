package com.tanvi.yummyproject.mapper;

import com.tanvi.yummyproject.dto.ProductRequest;
import com.tanvi.yummyproject.entity.Customer;
import com.tanvi.yummyproject.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }


}
