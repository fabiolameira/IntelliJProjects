package SnailRace;

import java.util.Random;

public class snail extends Thread {

    private int dorsal;
    private Random random = new Random();
    private int moveDistance;
    private int totalDistance;
    private int totalMoves;
    private int snailPlace;
    route route = new route();


    private static int place = 1;
    private static char placeSuffix = 'º';

    snail(int dorsal, route route) {
        this.dorsal = dorsal;
        this.moveDistance = moveDistance;
        this.totalMoves = totalMoves;
        this.snailPlace = snailPlace;
        this.route.setDistance(route.getDistance());
        totalDistance += moveDistance;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int getTotalMoves() {
        return totalMoves;
    }


    public int getSnailPlace() {

        return snailPlace;
    }

    public void setSnailPlace(int place) {
        this.snailPlace = place;
    }


    public void move() {
        moveDistance = random.nextInt(10) + 1;
        totalDistance += moveDistance;
        totalMoves++;
    }

    public void printingStatus() {
        System.out.println("O Caracol #" + getDorsal() + " avançou " + getMoveDistance() + " mm. Já percorreu um total de "
                + getTotalDistance() + " mm.");
    }


    public void printingPlaces() {
        setSnailPlace(place);
        System.out.println("O Caracol #" + getDorsal() + " passou a meta em " + getSnailPlace() + placeSuffix + " lugar!" +
                " Percorrendo um total de " + getTotalDistance() + " mm em " + getTotalMoves() + " Movimentos!");
        place++;
    }

    public void printingAllStatus() {
        System.out.println("Dorsal: " + getDorsal());
        System.out.println("Distância Total: " + getTotalDistance());
        System.out.println("Movimentos Totais: " + getTotalMoves());
        System.out.println("Lugar: " + getSnailPlace());
    }

    public void run() {
        try {
            while (totalDistance < route.getDistance()) {
                move();
                Thread.sleep(100);
                if (totalDistance < route.getDistance()) {
                    printingStatus();
                } else {
                    printingPlaces();
                }
            }

        } catch (Exception e) {
            System.out.println("Exception unspecified");
        }

        printingAllStatus();
    }
}
