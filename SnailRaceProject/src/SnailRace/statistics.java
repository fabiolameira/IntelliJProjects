package SnailRace;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class statistics {

    private int[] totalDistance = new int[500];
    private int[] totalMoves = new int[500];
    private int[] snailPlace = new int[500];
    private long[] runTime = new long[500];

    private final Lock queueLock = new ReentrantLock();
    private int counter = 1;
    private int placeCounter = 1;

    statistics() {

    }

    public void saveStatistics(int dorsal, int totalDistance, int totalMoves, long runTime) {
        queueLock.lock();
        this.totalDistance[dorsal] = totalDistance;
        this.totalMoves[dorsal] = totalMoves;
        this.runTime[dorsal] = runTime;
        counter++;
        queueLock.unlock();
    }

    public int getSnailPlace(int dorsal) {
        return this.snailPlace[dorsal];
    }

    public void setSnailPlace(int dorsal) {
        this.snailPlace[dorsal] = this.placeCounter;
        placeCounter++;
    }

    public void showStatistics() {
        queueLock.lock();
        for (int c = 1; c < counter; c++) {
            System.out.println("                                    ============================================");
            System.out.println("                                    ॥      Dorsal: " + c + "                           ॥");
            System.out.println("                                    ॥      Classificação: " + this.snailPlace[c] + "º Lugar             ॥");
            System.out.println("                                    ॥      Distancia Total: " + this.totalDistance[c] + "                ॥");
            System.out.println("                                    ॥      Total de Movimentos: " + this.totalMoves[c] +"             ॥");
            System.out.println("                                    ॥      Tempo de Corrida: " + this.runTime[c] + " segundo(s)     ॥");
            System.out.println("                                    ॥      Média de mm por Avanço: " + (this.totalDistance[c] / this.totalMoves[c])
                    + " mm        ॥");
            System.out.println("                                    ============================================");
            System.out.print("\n");
        }
        queueLock.unlock();
    }
}
