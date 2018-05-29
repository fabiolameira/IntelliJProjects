package SnailRace;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class snail extends Thread {

    private int dorsal;
    private int route;
    private int speed;
    private int moveDistance;
    private int totalDistance;
    private int totalMoves;
    private int snailPlace;

    private Random random = new Random();


    private static int place = 1;
    private static char placeSuffix = 'º';

    private final Lock queueLock = new ReentrantLock();

    snail(int dorsal, route route) {
        this.dorsal = dorsal;
        this.route = route.getDistance();
        this.speed = route.getSpeed();
        totalDistance += moveDistance;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public int getMoveDistance() {
        return this.moveDistance;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalMoves() {
        return this.totalMoves;
    }

    public int getSnailPlace() {
        return this.snailPlace;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    private void setTotalMoves(int totalMoves){
        this.totalMoves = totalMoves;
    }

    private void setSnailPlace(int place) {
        this.snailPlace = place;
    }


    public void move() {
        this.moveDistance = random.nextInt(speed) + 1;
        this.totalDistance += this.moveDistance;
        this.totalMoves++;
    }

    public void printingRunningStatus() {
        System.out.println("O Caracol #" + getDorsal() + " avançou " + getMoveDistance() + " mm. Já percorreu um total de "
                + getTotalDistance() + " mm.");
    }


    public void printingPlaces() {
        queueLock.lock();
        setSnailPlace(this.place);
        System.out.println("O Caracol #" + getDorsal() + " passou a meta em " + getSnailPlace() + this.placeSuffix + " lugar!" +
                " Percorrendo um total de " + getTotalDistance() + " mm em " + getTotalMoves() + " Movimentos!");
        this.place++;
        queueLock.unlock();
    }

    private void setAllStatus() {
        setTotalDistance(getTotalDistance());
        setTotalMoves(getTotalMoves());
        setSnailPlace(getSnailPlace());
    }

    public void printingAllStatus() {
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Distância Total: " + getTotalDistance());
        System.out.println("Movimentos Totais: " + getTotalMoves());
        System.out.println("Lugar: " + getSnailPlace());
    }

    public void run() {
        try {
            while (this.totalDistance < this.route) {
                move();
                Thread.sleep(100);
                if (this.totalDistance < this.route) {
                    printingRunningStatus();
                } else {
                    printingPlaces();
                    setAllStatus();
                    printingAllStatus();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception unspecified");
        }
    }
}
