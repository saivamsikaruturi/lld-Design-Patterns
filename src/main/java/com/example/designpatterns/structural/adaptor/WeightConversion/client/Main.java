package com.example.designpatterns.structural.adaptor.WeightConversion.client;


import com.example.designpatterns.structural.adaptor.WeightConversion.adaptee.WeightMachineForBabies;
import com.example.designpatterns.structural.adaptor.WeightConversion.adaptor.WeightMachineAdapter;
import com.example.designpatterns.structural.adaptor.WeightConversion.adaptor.WeightMachineAdapterImpl;

public class Main {

        public static void main(String args[]){

            WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
            System.out.println(weightMachineAdapter.getWeightInKg());


    }
}
