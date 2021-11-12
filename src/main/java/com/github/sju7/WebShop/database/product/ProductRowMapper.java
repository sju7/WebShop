package com.github.sju7.WebShop.database.product;

import com.github.sju7.WebShop.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(
                rs.getInt("productid"),
                rs.getString("productname"),
                rs.getString("productdescription"),
                rs.getString("categoriid"),
                rs.getInt("stock")
        );
    }
}
