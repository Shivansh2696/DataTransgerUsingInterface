package com.interfaceexample;

public class Main {

    public static void main(String[] args) {
        new TestInterface(new ExampleInterface() {
            @Override
            public void onSuccess(String data) {
                System.out.println(data);
            }
        }).getData();
    }
}
