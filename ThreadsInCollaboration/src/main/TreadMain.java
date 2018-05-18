package main;

public class TreadMain {

    public static void main(String[] args) {

        int checksum = 0;
        for (int i = 1; i <= 10; i++) {
            checksum += i;
        }

        System.out.println("Check Result is " + checksum);

        CountUp t1 = new CountUp(1, 5);
        t1.setName("T1");
        t1.start();

        CountUp t2 = new CountUp(6, 10);
        t2.setName("T2");
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        System.out.println("Final Result is " + (t1.total + t2.total));
    }

}
