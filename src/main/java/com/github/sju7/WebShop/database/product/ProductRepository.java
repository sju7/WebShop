package com.github.sju7.WebShop.database.product;

import com.github.sju7.WebShop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    public List<Product> getByCategori(int categoriid) {
        List<Product> ps = template.query("SELECT * FROM PRODUCT WHERE categoriid = " + 1,
                new MapSqlParameterSource().addValue("categoriid", 1), new ProductRowMapper());
        return ps;
    }

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
