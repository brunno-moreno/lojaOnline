package com.example.lojaOnline.product;

public record ProductResponseDTO(Long id, String name, String img, Integer price) {

    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getImg(), product.getPrice());
    }
}
