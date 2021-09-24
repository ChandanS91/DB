package com.example.db.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartItemsDataAccess implements CartItemsRep
{
    JdbcTemplate jdbcTemplate;
    JdbcOperations jdbcOperations;
    private static final String SELECT_ITEMS="SELECT SERIALNO, NAME FROM ITEMS";
    public CartItemsDataAccess(){}
    RowMapper<CartItems> itemsRowMapper=(ResultSet rs, int rowNum) -> {
        CartItems c=new CartItems();
        c.setId(rs.getInt("SERIALNO"));
        c.setName(rs.getString("NAME"));
        return c;
    };
    // bean DataConfigurationProfiler for embedded data source
    @Autowired
    public JdbcOperations getJdbcOperations(DataConfigurationProfiler dC)
    {
        jdbcOperations=new JdbcTemplate(dC.embeddedDS());
        if(jdbcOperations!=null)
            System.out.println(jdbcOperations);
        return jdbcOperations;
    }

    @Override
    public List<CartItems> getCart() {
        //List all items without query param and queryforobject
        return jdbcOperations.query(SELECT_ITEMS, itemsRowMapper);
    }
}
