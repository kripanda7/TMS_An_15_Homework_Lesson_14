package com.teachmeskills.hometask.lesson14.task1;

public class Runner {
    public static void main(String[] args) {
        ReadingNewsThread readingNewsThread = new ReadingNewsThread("ReadingNews");
        DrinkingCoffeeThread drinkingCoffeeThread = new DrinkingCoffeeThread("DrinkingCoffee");


        Thread breakfastTread = new Thread(() -> {
            Thread.currentThread().setName("Breakfast");
            try {
                Thread.sleep(2000);
                System.out.println("Staring to cooking breakfast.");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Place the " + i + " egg in the frying pan.");
                    Thread.sleep(2000);
                }
                System.out.println("Eating breakfast.");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        drinkingCoffeeThread.start();
        breakfastTread.start();
        readingNewsThread.start();
    }
}
