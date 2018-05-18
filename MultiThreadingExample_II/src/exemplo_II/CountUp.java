package exemplo_II;

public class CountUp implements Runnable {

    private Thread x;
    private final String threadName;

    CountUp(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        } catch (Exception e) {
            System.out.println("Exception unspecified");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    
        public void start () {
        System.out.println("Starting " + threadName);
        if (x ==null) {
            x = new Thread (this,threadName);
            x.start();
        }
    }

}
