package com.example.designpatterns.structural.adaptordp.client;

import com.example.designpatterns.structural.adaptordp.adaptee.WeightMachineForBabies;
import com.example.designpatterns.structural.adaptordp.adaptor.WeightMachineAdapter;
import com.example.designpatterns.structural.adaptordp.adaptor.WeightMachineAdapterImpl;

public class Main {

        public static void main(String args[]){

            WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
            System.out.println(weightMachineAdapter.getWeightInKg());


    }
}
