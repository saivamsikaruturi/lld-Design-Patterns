package com.example.designpatterns.behavioural.state.VendingMachine;

import java.util.ArrayList;

public class Inventory {
    ItemSelf[] inventory = null;

   

    Inventory(int itemCount) {
        inventory = new ItemSelf[itemCount];
        initialEmptyInventory();
    }

    public ItemSelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemSelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemSelf space = new ItemSelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]= space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {

        for (ItemSelf ItemSelf : inventory) {
            if (ItemSelf.code == codeNumber) {
                if (ItemSelf.isSoldOut()) {
                    ItemSelf.item = item;
                    ItemSelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {

        for (ItemSelf ItemSelf : inventory) {
            if (ItemSelf.code == codeNumber) {
                if (ItemSelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return ItemSelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        ArrayList<int[]> list = new ArrayList<>();
        int[] v = list.get(0);
        for (ItemSelf ItemSelf : inventory) {
            if (ItemSelf.code == codeNumber) {
                ItemSelf.setSoldOut(true);
            }
        }
    }


}
