package com.example.designpatterns.behavioural.command.cartexample.data;

import com.example.designpatterns.behavioural.command.cartexample.model.FoodMenu;
import com.example.designpatterns.behavioural.command.cartexample.model.MealType;
import com.example.designpatterns.behavioural.command.cartexample.model.MenuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodMenuData {
    private Map<String, FoodMenu> foodMenuById = new HashMap<>();
    private Map<String, String> foodMenuIdByRestaurantId = new HashMap<>();
    private Map<String, MenuItem> menuItemById = new HashMap<>();


    public Map<String, FoodMenu> getFoodMenuById() {
        MenuItem menuItem = new MenuItem(   "Biryani",
                "Biryani",
                MealType.DINNER,
                250.00);
      FoodMenu foodMenu =new FoodMenu("1",List.of("Bawaachi"), List.of(menuItem));

        foodMenuById.put("Biryani",foodMenu);
        return foodMenuById;
    }

    public Map<String, String> getFoodMenuIdByRestaurantId() {
        foodMenuIdByRestaurantId.put("Bawaachi","Biryani");
        return foodMenuIdByRestaurantId;
    }

    public Map<String, MenuItem> getMenuItemById() {
        return menuItemById;
    }
}
