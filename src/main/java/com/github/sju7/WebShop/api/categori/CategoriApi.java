package com.github.sju7.WebShop.api.categori;

import com.github.sju7.WebShop.database.categori.CategoriRepository;
import com.github.sju7.WebShop.database.product.ProductRepository;
import com.github.sju7.WebShop.model.Categori;
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
@RequestMapping("api/categori")
public class CategoriApi {
    private final CategoriRepository repository;
    private final ProductRepository productRepository;

    @GetMapping("/products")
    @Operation(
            summary = "Gets all product from a categori",
            description = "Gets all products from a categori from db"
    )
    public ResponseEntity<List<Product>> getProductsInCateGory (int id){
        return ResponseEntity.ok().body(productRepository.getByCategori(id));
    }

    @PostMapping("/")
    @Operation(
            summary = "Reigster a new categori",
            description = "Registers a new categori to db"
    )
    public ResponseEntity<HttpStatus> getProducts(CategoriRequest c){
        repository.addCategori(new Categori(0, c.getCategoriName()));
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
