package com.catalogue.Search.repository;


import com.catalogue.Search.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingAndCategoryAndBrandAndPriceBetween(
            String name, String category, String brand, BigDecimal priceMin, BigDecimal priceMax);

    List<Product> findByNameContainingAndBrandAndPriceBetween(
            String name, String brand, BigDecimal priceMin, BigDecimal priceMax);

    List<Product> findByNameContainingAndCategoryAndPriceBetween(
            String name, String category, BigDecimal priceMin, BigDecimal priceMax);

    List<Product> findByNameContainingAndPriceBetween(
            String name, BigDecimal priceMin, BigDecimal priceMax);

    List<Product> findByNameContainingAndCategoryAndBrand(
            String name, String category, String brand);

    List<Product> findByNameContainingAndCategory(
            String name, String category);

    List<Product> findByNameContainingAndBrand(
            String name, String brand);

    List<Product> findByNameContaining(
            String name);
}
