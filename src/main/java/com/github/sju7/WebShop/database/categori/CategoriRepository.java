package com.github.sju7.WebShop.database.categori;

import com.github.sju7.WebShop.model.Categori;
import com.github.sju7.WebShop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoriRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    public Categori addCategori(Categori c) {
        template.update("INSERT INTO CATEGORI(categoriname) VALUES(:categoriname)",
                new MapSqlParameterSource().addValue("categoriname", c.getCateGoriName()));
        return c;
    }
}
