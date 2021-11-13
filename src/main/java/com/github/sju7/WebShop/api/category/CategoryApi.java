package com.github.sju7.WebShop.api.category;

import com.github.sju7.WebShop.database.category.CategoryRepository;
import com.github.sju7.WebShop.database.product.ProductRepository;
import com.github.sju7.WebShop.model.Category;
import com.github.sju7.WebShop.model.Product;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/category")
public class CategoryApi {
    private final CategoryRepository repository;
    private final ProductRepository productRepository;

    @GetMapping("/products")
    @Operation(
            summary = "Gets all product from a category",
            description = "Gets all products from a category from db"
    )
    public ResponseEntity<List<Product>> getProductsInCateGory (int id){
        return ResponseEntity.ok().body(productRepository.getByCategory(id));
    }

    @PostMapping("/")
    @Operation(
            summary = "Reigster a new category",
            description = "Registers a new category to db"
    )
    public ResponseEntity<HttpStatus> getProducts(CategoryRequest c){
        repository.addCategory(new Category(0, c.getCategoryName()));
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
