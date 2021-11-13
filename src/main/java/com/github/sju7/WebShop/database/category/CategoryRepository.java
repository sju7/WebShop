package com.github.sju7.WebShop.database.category;

import com.github.sju7.WebShop.model.Category;
import com.github.sju7.WebShop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoryRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    public Category addCategory(Category c) {
        template.update("INSERT INTO CATEGORI(categoryname) VALUES(:categoryname)",
                new MapSqlParameterSource().addValue("categoryname", c.getCateGoriName()));
        return c;
    }
}
