package com.catalogue.Search.service;


import com.catalogue.Search.model.Product;
import com.catalogue.Search.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProducts(String query, String category, String brand, BigDecimal priceMin, BigDecimal priceMax) {
        if (priceMin != null && priceMax != null && brand != null && category != null) {
            return productRepository.findByNameContainingAndCategoryAndBrandAndPriceBetween(query, category, brand, priceMin, priceMax);
        } else if (priceMin != null && priceMax != null && brand == null && category == null) {
            return productRepository.findByNameContainingAndPriceBetween(query, priceMin, priceMax);
        } else if (priceMin != null && priceMax != null && brand != null) {
            return productRepository.findByNameContainingAndBrandAndPriceBetween(query, brand, priceMin, priceMax);
        } else if (priceMin != null && priceMax != null) {
            return productRepository.findByNameContainingAndCategoryAndPriceBetween(query, category, priceMin, priceMax);
        } else if (category != null && brand != null) {
            return productRepository.findByNameContainingAndCategoryAndBrand(query, category, brand);
        } else if (category != null) {
            return productRepository.findByNameContainingAndCategory(query, category);
        } else if (brand != null) {
            return productRepository.findByNameContainingAndBrand(query, brand);
        } else {
            return productRepository.findByNameContaining(query);
        }
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
