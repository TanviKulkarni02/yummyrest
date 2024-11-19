package com.tanvi.yummyproject.controller;


import com.tanvi.yummyproject.dto.ProductRequest;
import com.tanvi.yummyproject.entity.Product;
import com.tanvi.yummyproject.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;
//
//    @PostMapping
//    public ResponseEntity<String> createProduct(@RequestBody @Valid ProductRequest request) {
//      //  return ResponseEntity.ok(productService.createProduct(request));
//    }
//    @GetMapping("/top2")
//    public ResponseEntity<List<Product>> getTop2Products() {
//        double minPrice = 15.0;
//        double maxPrice = 30.0;
//      //  List<Product> products = productService.getTop2ProductsInPriceRange(minPrice, maxPrice);
//      //  return ResponseEntity.ok(products);
//        return;
//    }
}

