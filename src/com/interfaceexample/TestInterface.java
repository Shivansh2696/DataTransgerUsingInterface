package com.interfaceexample;

import java.util.Timer;
import java.util.TimerTask;

public class TestInterface {
    private ExampleInterface anInterface;

    public TestInterface(ExampleInterface anInterface) {
        this.anInterface = anInterface;
    }

    public void getData(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(anInterface != null){
                    anInterface.onSuccess("Sunny");
                }
            }
        };

        Timer timer =  new Timer();
        timer.schedule(task,5000);
    }
}
