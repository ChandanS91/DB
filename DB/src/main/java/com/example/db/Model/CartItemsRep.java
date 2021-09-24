package com.example.db.Model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface CartItemsRep
{
    List<CartItems> getCart();
}
