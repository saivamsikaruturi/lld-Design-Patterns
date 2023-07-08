package com.example.designpatterns.behavioural.command.cartexample.pattern;

import com.example.designpatterns.behavioural.command.cartexample.FoodDeliveryException;

public abstract class CartCommandExecutor {
    public void execute(final String userId,final String restaurantId, final String itemId) throws Exception {
        if (!isValid(userId, restaurantId, itemId)) {
            throw new FoodDeliveryException("menu item not found");
        }
        executeCommand(userId, restaurantId, itemId);
    }

    public abstract boolean isValid(final String userId, final String restaurantId, final String itemId);

    public abstract void executeCommand(final String userId, final String restaurantId, final String itemId);

    public abstract boolean isApplicable(final CartCommandType cartCommandType);

}
