package main;

public class ThreadClassDemo {

    public static void main(String[] args) {
        /*
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);
		thread1.setName("T-1");
		System.out.println("Starting hello thread...");
		thread1.start();

		Runnable bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		thread2.setName("T-2");
		System.out.println("Starting goodbye thread...");
		thread2.start();
         */

        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(27);
        thread3.setName("T-3");
        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(27);
        thread4.setName("T-4");
        thread4.start();

        System.out.println("Starting thread5...");
        Thread thread5 = new GuessANumber(27);
        thread5.setName("T-5");
        thread5.start();
        /*		
		try {
		    Thread.sleep(1);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
         */
        System.out.println("main() is ending...");
    }
}
