package main;

public class CountUp extends Thread {
    
    public int start, finish, total;
    
    public CountUp(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
    
    public void run() {
        long startTime = System.nanoTime();
        while (this.start <= this.finish) {
            this.total += this.start;
            this.start++;
        }
        System.out.println(this.getName() + " has finished in " + (System.nanoTime() - startTime) + " nanoseconds");
    }
    
}
