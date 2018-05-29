package SnailRace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int competitors = 0;
        int distance = 0;
        char customSpeedQuestion = ' ';
        int customSpeed = 0;
        int counter = 0;

        Scanner keyBoard = new Scanner(System.in);

        System.out.println("###########################################################################");
        System.out.println("#      Seja Bem Vindo à maior e melhor corrida de Caracóis do Mundo!      #");
        System.out.println("#                    Aqui quem manda é o espectador!!!                    #");
        System.out.println("###########################################################################");

        System.out.println("Quantos caracóis queres ver a competir pelo derradeiro prémio?");

        do {
            try {
                competitors = keyBoard.nextInt();
                if (competitors < 3) {
                    System.out.println("Ehhh!! Têm de ser pelo menos 3 Caracóis");
                }

            } catch (InputMismatchException e) {
                System.out.print("We got an error: ");
                System.out.println("Não nos deste um número inteiro. Tenta outra vez...");
                keyBoard.next();
            }
        } while (competitors < 3);

        System.out.println("Boa! E agora, qual é a distancia que queres que eles precorram?");

        do {
            try {
                distance = keyBoard.nextInt();
                if (distance < 100) {
                    System.out.println("Ehhh!! A distancia mínima é de 100mm");
                }
            } catch (InputMismatchException e) {
                System.out.print("We got an error: ");
                System.out.println("Não nos deste um número inteiro. Tenta outra vez...");
                keyBoard.next();
            }
        } while (distance < 100);

        System.out.println("Desejas adicionar uma velocidade personalizada? (S/N)");

        do {
            try {
                customSpeedQuestion = keyBoard.next().charAt(0);
                if (customSpeedQuestion != 'S' && customSpeedQuestion != 's' && customSpeedQuestion != 'N' && customSpeedQuestion != 'n') {
                    System.out.println("A resposta não é válida, tenta outra vez.");
                }
            } catch (InputMismatchException e) {
                System.out.print("We got an error: ");
                System.out.println("A resposta não é válida, tenta outra vez.");
                keyBoard.next();
            }
        }
        while (customSpeedQuestion != 'S' && customSpeedQuestion != 's' && customSpeedQuestion != 'N' && customSpeedQuestion != 'n');

        if (customSpeedQuestion == 'N' || customSpeedQuestion == 'n') {
            customSpeed = 10;
            System.out.println("Velociade máxima definida com 10mm/movimento");
        } else if (customSpeedQuestion == 'S' || customSpeedQuestion == 's') {
            System.out.println("Ótimo, qual é a velocidade máxima que queres definir (1 a 10)?");

            do {
                try {
                    customSpeed = keyBoard.nextInt();
                    if (customSpeed < 1 || customSpeed > 10) {
                        System.out.println("A resposta não é válida... A velocidade tem de estar entre 1 e 10mm/movimento.");
                        System.out.println("Tenta de novo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("We got an error: ");
                    System.out.println("A resposta não é válida, tenta outra vez.");
                    keyBoard.next();
                }
            }
            while (customSpeed < 1 || customSpeed > 10);

            System.out.println("Velociade máxima definida com " + customSpeed + "mm/movimento");
        }

        System.out.println("Vamos a isso então! :D");
        System.out.println("\n");
        System.out.println("\n");

        route route = new route(distance, customSpeed);
        Thread thread[] = new Thread[competitors];

        do {
            thread[counter] = new Thread(new snail(counter + 1, route));
            System.out.println("Caracol #" + (counter + 1) + " pronto para correr!");
            counter++;
        } while (counter < competitors);

        for (counter = 0; counter < competitors; counter++) {
            thread[counter].start();
        }
        for (counter = 0; counter < competitors; counter++) {
            try {
                thread[counter].join();
            } catch (InterruptedException ex) {
                System.out.print("We got an error: ");
                System.out.println("A abortar");
            }
        }
    }
}
