package main;

import java.util.concurrent.Semaphore;
        
public class Semaforos {

    static int counter = 0;
    static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {

        Thread thread1 = new Thread() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        semaphore.acquire();
                        counter++;
                        System.out.println("Thread 1 incremented counter to ..: " + counter);
                        semaphore.release();
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread2 = new Thread() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        semaphore.acquire();
                        counter++;
                        System.out.println("Thread 2 incremented counter to ..: " + counter);
                        semaphore.release();
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        
        thread1.start();
        thread2.start();
        
        while (thread1.isAlive() || thread2.isAlive()) {
        }

        System.out.println("Counter : " + counter);
        
    }

}
