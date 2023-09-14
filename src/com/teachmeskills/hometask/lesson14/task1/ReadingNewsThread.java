package com.teachmeskills.hometask.lesson14.task1;

public class ReadingNewsThread extends Thread {
    private String name;

    public ReadingNewsThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Starting to reading news.");
            Thread.sleep(1000);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Reading topic " + i);
                Thread.sleep(7000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
