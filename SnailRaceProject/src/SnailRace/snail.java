package SnailRace;

import java.util.Random;

public class snail extends Thread {

    private int dorsal;
    private int route;
    private int speed;
    private int moveDistance;
    private int totalDistance;
    private int totalMoves;
    private long runTime;

    private statistics statistics = new statistics();

    private Random random = new Random();

    snail(int dorsal, route route, statistics statistics) {
        this.dorsal = dorsal;
        this.route = route.getDistance();
        this.speed = route.getSpeed();
        this.statistics = statistics;
        totalDistance += moveDistance;
    }

    private int getDorsal() {
        return this.dorsal;
    }

    private int getMoveDistance() {
        return this.moveDistance;
    }

    private int getTotalDistance() {
        return this.totalDistance;
    }

    private int getTotalMoves() {
        return this.totalMoves;
    }

    private void move() {
        this.moveDistance = random.nextInt(speed) + 1;
        this.totalDistance += this.moveDistance;
        this.totalMoves++;
    }

    private void printingRunningStatus() {
        System.out.println("O Caracol #" + getDorsal() + " avançou " + getMoveDistance() + " mm. Já percorreu um total de "
                + getTotalDistance() + " mm.");
    }

    private void printingFinalStatus() {
        System.out.println("O Caracol #" + getDorsal() + " cruzou a meta em " + statistics.getSnailPlace(getDorsal()) + "º Lugar!"
                + "Percorreu um total de " + getTotalDistance() + " em " + getTotalMoves() + " movimentos!");
        System.out.println();
    }

    private void saveStatistics() {
        this.runTime = ((System.currentTimeMillis() - this.runTime) / 1000);
        statistics.saveStatistics(this.dorsal, this.totalDistance, this.totalMoves, this.runTime);
    }

    public void run() {
        try {
            this.runTime = System.currentTimeMillis();
            while (this.totalDistance < this.route) {
                move();
                Thread.sleep(100);
                if (this.totalDistance < this.route) {
                    printingRunningStatus();
                } else {
                    statistics.setSnailPlace(dorsal);
                    saveStatistics();
                    printingFinalStatus();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception unspecified");
        }
    }
}
