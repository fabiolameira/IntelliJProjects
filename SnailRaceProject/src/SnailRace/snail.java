package SnailRace;

import java.util.Random;

public class snail extends Thread {

    private int dorsal;
    private Random random = new Random();
    private int moveDistance;
    private int totalDistance;
    private int totalMoves;
    route route = new route();


    snail(int dorsal, route route) {
        this.dorsal = dorsal;
        this.moveDistance = moveDistance;
        this.totalMoves = totalMoves;
        this.route.setDistance(route.getDistance());
        totalDistance += moveDistance;
    }


    public void move() {
        moveDistance = random.nextInt(5) + 1;
        totalDistance += moveDistance;
        totalMoves++;
    }

    public void printingStatus() {
        System.out.println("O Caracol #" + dorsal + " avançou " + moveDistance + " mm. Já percorreu um total de "
                + totalDistance + " mm. :D");
    }

    public void run() {
        try {
            while (totalDistance < route.getDistance()) {
                move();
                printingStatus();
                Thread.sleep(500);
            }

        } catch (Exception e) {
            System.out.println("Exception unspecified");
        }
    }
}
