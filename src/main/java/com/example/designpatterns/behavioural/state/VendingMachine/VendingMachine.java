package com.example.designpatterns.behavioural.state.VendingMachine;

import com.example.designpatterns.behavioural.state.VendingMachine.Impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    Inventory inventory;
    List<Coin> coin;

    public VendingMachine() {
       coin = new ArrayList<>();
        inventory = new Inventory(10);
        state = new IdleState();
    }

    public List<Coin> getCoin() {
        return coin;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public State getState() {
        return state;
    }

    public void setCoin(List<Coin> coin) {
        this.coin = coin;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setState(State state) {
        this.state = state;
    }
}
