package com.example.designpatterns.behavioural.command.cartexample;

import com.example.designpatterns.behavioural.command.cartexample.data.CartData;
import com.example.designpatterns.behavioural.command.cartexample.data.FoodMenuData;
import com.example.designpatterns.behavioural.command.cartexample.pattern.AddCartCommandExecutor;
import com.example.designpatterns.behavioural.command.cartexample.pattern.CartCommandExecutor;
import com.example.designpatterns.behavioural.command.cartexample.pattern.CartCommandType;
import com.example.designpatterns.behavioural.command.cartexample.pattern.RemoveCartCommandExecutor;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws Exception {

        CartData cartData = new CartData();
        FoodMenuService foodMenuService = new FoodMenuService(new FoodMenuData());

        List<CartCommandExecutor> cartCommandExecutorList =  Arrays.asList(new AddCartCommandExecutor(foodMenuService, cartData),
                new RemoveCartCommandExecutor(cartData));

        CartCommandType cartCommandType = CartCommandType.REMOVE_ITEM;
        for (CartCommandExecutor cartCommandExecutor : cartCommandExecutorList) {

            if (cartCommandExecutor.isApplicable(CartCommandType.ADD_ITEM)) {
                cartCommandExecutor.execute("lava", "Bawaachi", "Biryani");
            }

            if (cartCommandExecutor.isApplicable(CartCommandType.REMOVE_ITEM)) {
                cartCommandExecutor.execute("lava", "Bawaachi", "Biryani");
            }
        }
    }
}
