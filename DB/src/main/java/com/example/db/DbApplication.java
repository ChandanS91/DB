package com.example.db;

import com.example.db.Model.CartItems;
import com.example.db.Model.CartItemsRep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DbApplication {
    private static CartItemsRep c;
    // component cart items
    public DbApplication(CartItemsRep c)
    {
        this.c=c;
    }
    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
        System.out.println("Hello World........");
        List<CartItems> itemsList=c.getCart();
        itemsList.forEach(System.out::println);
    }
}
