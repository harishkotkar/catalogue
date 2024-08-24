package com.catalogue.Search.controller;


import com.catalogue.Search.exception.BadRequestException;
import com.catalogue.Search.exception.ProductNotFoundException;
import com.catalogue.Search.model.Product;
import com.catalogue.Search.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(
            @RequestParam(required = false, defaultValue = "") String query,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) BigDecimal priceMin,
            @RequestParam(required = false) BigDecimal priceMax) {

        if (priceMin != null && priceMax != null && priceMin.compareTo(priceMax) > 0) {
            throw new BadRequestException("Minimum price cannot be greater than maximum price");
        }

        List<Product> products = productService.searchProducts(query, category, brand, priceMin, priceMax);
        if (products.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductDetails(@PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        if (product == null) {
            throw new ProductNotFoundException(productId);
        }
        return ResponseEntity.ok(product);
    }
}
