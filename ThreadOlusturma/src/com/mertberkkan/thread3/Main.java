package com.mertberkkan.thread3;

public class Main {

    public static void main(String[] args) {

        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor.");

                for (int i = 1; i <= 10; i++){

                    System.out.println("Yazıyor: " + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread kesintiye uğradı.");
                    }

                }

            }
        });


        printer1.start();




        System.out.println("Thread çalışıyor.");
    }
}
