package com.teachmeskills.hometask.lesson14.task2;

import com.teachmeskills.hometask.lesson14.task2.model.ServiceStation;

public class Runner {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Thread carReceiving = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                serviceStation.put();
            }
        });

        Thread carDeparture = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                serviceStation.get();
            }
        });
        carReceiving.start();
        carDeparture.start();
    }
}
