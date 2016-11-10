package com.yet.spring.serzh;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Serzh on 11/8/16.
 */
public class Temp {
    public static void main(String[] args) {
//        int id = new Random().nextInt(Integer.MAX_VALUE);

        AtomicInteger AUTO_ID = new AtomicInteger(0);
        int id = AUTO_ID.getAndIncrement();
        int id2 = AUTO_ID.getAndIncrement();
        int id3 = AUTO_ID.getAndIncrement();
        int id4 = AUTO_ID.getAndIncrement();
        System.out.println(id);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id4);
    }
}
