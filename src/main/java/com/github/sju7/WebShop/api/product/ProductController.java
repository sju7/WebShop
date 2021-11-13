package com.github.sju7.WebShop.api.product;

import com.github.sju7.WebShop.database.product.ProductRepository;
import com.github.sju7.WebShop.model.Product;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {

    private final ProductRepository repository;

    @GetMapping("/products")
    @Operation(
            summary = "Gets all product",
            description = "Gets all products from db"
    )
    public List<Product> getProducts(){
        return new ArrayList<>(null);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Gets product from id",
            description = "Gets a product from pathvariable id"
    )
    public Product getProductById(@PathVariable(value="id") int id){
        return null;
    }

    @PostMapping("/")
    public ResponseEntity<HttpStatus> newProduct(ProductRequest p){
        repository.addProduct(new Product(0, p.getName(), p.getDescription(), p.getCategori(), p.getStock()));
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
