package com.teachmeskills.hometask.lesson14.task1;

public class DrinkingCoffeeThread extends Thread {
    private String name;

    public DrinkingCoffeeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting to making coffee.");
            Thread.sleep(20000);
            System.out.println("Staring drinking coffee.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
