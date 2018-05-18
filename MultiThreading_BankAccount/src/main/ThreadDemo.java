package main;

public class ThreadDemo {

    public static void main(String[] args) {

        Conta saldo = new Conta(5000);

        System.out.println("Starting Thread 1");
        Thread t1 = new Consumo(saldo);
        t1.setName("Thread 1");
        t1.start();

        System.out.println("Starting Thread 2");
        Thread t2 = new Consumo(saldo);
        t2.setName("Thread 2");
        t2.start();
        
        System.out.println("Ending main()");
    }

}
