package com.example.designpatterns.behavioural.state.VendingMachine;

public class ItemSelf {
        Item item;
        int code;
        boolean isSoldOut;

        public int getCode() {
                return code;
        }

        public void setCode(int code) {
                this.code = code;
        }

        public Item getItem() {
                return item;
        }

        public void setItem(Item item) {
                this.item = item;
        }

        public boolean isSoldOut() {
                return isSoldOut;
        }

        public void setSoldOut(boolean soldOut) {
                this.isSoldOut = soldOut;
        }

}
