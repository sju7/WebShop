package com.github.sju7.WebShop.database.product;

import com.github.sju7.WebShop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    public Product getById(int productid) {
        Product p = template.queryForObject("SELECT * FROM PRODUCT WHERE productid = :productid",
                new MapSqlParameterSource().addValue("productid", productid), new ProductRowMapper());
        return p;
    }

    public Product addProduct(Product p) {
       template.update("INSERT INTO PRODUCT(productname, productdescription, stock) VALUES(:productname, :productdescription, :stock)",
                new MapSqlParameterSource().addValue("productname", p.getName())
                                            .addValue("productdescription", p.getDescription())
                                            .addValue("stock", p.getStock()));
        return p;
    }
}
