package com.example.db.Model;

public class CartItems
{
    private int id;
    private String name;

    public CartItems() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CartItems{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
