package exemplo_II;

public class ThreadMain {

    public static void main(String[] args) {

        CountUp CU = new CountUp("CountUp");
        CU.start();

        CountDown CD = new CountDown("CountDown");
        CD.start();

    }
}
