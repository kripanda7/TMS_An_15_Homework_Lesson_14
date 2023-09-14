package com.teachmeskills.hometask.lesson14.task2.model;

import static com.teachmeskills.hometask.lesson14.task2.constants.Constants.CARS_CAPACITY;

public class ServiceStation {
    private int cars = 0;

    /**
     * Getting car from service station
     */
    public synchronized void get() {
        while (cars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        cars--;

        System.out.println("One car is given away");
        System.out.println("Car's count in service station is : " + cars);

        notify();
    }

    /**
     * Adding car for service station
     */
    public synchronized void put() {
        while (cars >= CARS_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        cars++;

        System.out.println("Car is added to service station");
        System.out.println("Car's count in service station is : " + cars);

        notify();
    }
}
