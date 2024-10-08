package com.example.lojaOnline.controller;

import com.example.lojaOnline.product.Product;
import com.example.lojaOnline.product.ProductRepository;
import com.example.lojaOnline.product.ProductRequestDTO;
import com.example.lojaOnline.product.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")

public class ProductController {

    @Autowired
    private ProductRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void save(@RequestBody ProductRequestDTO data) {
        Product productData = new Product(data);
        repository.save(productData);
        return;
    };

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductResponseDTO> getAll() {

        List<ProductResponseDTO> productList = repository.findAll().stream().map(ProductResponseDTO::new).toList();
        return productList;
    }


}
