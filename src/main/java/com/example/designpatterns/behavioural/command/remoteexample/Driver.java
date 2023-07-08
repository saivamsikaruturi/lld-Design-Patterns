package com.example.designpatterns.behavioural.command.remoteexample;

public class Driver {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();


        remoteControl.setCommand(0,new LightOnCommand(new Light()),SlotType.ON);
        remoteControl.setCommand(0,new LightOffCommand(new Light()),SlotType.OFF);

        remoteControl.buttonPressed(0, SlotType.ON);

        remoteControl.offButtonPressed(0);
    }
}
