package com.example.designpatterns.behavioural.command.cartexample.model;


import java.awt.*;
import java.util.List;

public class FoodMenu {
    public FoodMenu(String id, List<String> restaurantIds, List<MenuItem> menuItemList) {
        this.id = id;
        this.restaurantIds = restaurantIds;
        this.menuItemList = menuItemList;
    }

    private String id;
    private List<String> restaurantIds;
    private List<MenuItem> menuItemList;

    public String getId() {
        return id;
    }

    public List<String> getRestaurantIds() {
        return restaurantIds;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}