package com.company.task3;

import java.util.Date;
import java.util.Random;

public class Client implements Runnable {
    Date date = new Date();
    Random random = new Random();


    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            String time = date.toString();
            synchronized (this) {
                TaskThree.server.add((random.nextInt(100)));
                TaskThree.statistic.add(time + Thread.currentThread().getName());
                try {
                    System.out.println(TaskThree.statistic.toString());
                } catch (NullPointerException n) {
                    System.out.println("Collection is empty!");
                }

            }

            i++;
        }
    }


}
