package exemplo_I;

public class TestTread {

    public static void main(String[] args) {
        
        RunnableDemo R1 = new RunnableDemo("Thread#1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread#2");
        R1.start();
        
    }
}
