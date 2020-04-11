package Lesson5;

import java.lang.reflect.Array;

public class Multithreading {

    static final int size = 10000000;
    static final int h = size / 2;



    static void singleThreading() {

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("" + (System.currentTimeMillis() - a));


    }

    static void multiThreading() throws InterruptedException {

        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];



        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        System.out.println("Время разделения массива на два: " + (System.currentTimeMillis() - a) );


        long b = System.currentTimeMillis();

        Thread one = new Thread(() -> {
            for (int i = 0; i <arr1.length ; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i <arr2.length ; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        System.out.println("Время вычисления новых значений: " + (System.currentTimeMillis() - b));

        one.start();
        two.start();

        one.join();
        two.join();

        long c = System.currentTimeMillis();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Время склейки двух массивов в один: " + (System.currentTimeMillis() - c));

    }

    public static void main(String[] args) throws InterruptedException {

        //singleThreading();

        multiThreading();

    }
}