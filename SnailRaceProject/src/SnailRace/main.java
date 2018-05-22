package SnailRace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int competitors = 0;
        int distance = 0;
        int counter = 0;

        Scanner keyBoard = new Scanner(System.in);

        System.out.println("###########################################################################");
        System.out.println("#      Seja Bem Vindo à maior e melhor corrida de Caracóis do Mundo!      #");
        System.out.println("#                    Aqui quem manda é o espectador!!!                    #");
        System.out.println("###########################################################################");


        try {
            System.out.println("      Quantos caracóis queres ver a competir pelo derradeiro prémio?");


            do {
                if (competitors != 0) {
                    System.out.println("                    Ehhh!! Têm de ser pelo menos 3 Caracóis");
                }
                competitors = keyBoard.nextInt();
            } while (competitors < 3);

        } catch (InputMismatchException e) {
            System.out.print("We got an error: ");
            System.out.println("Não nos deste um número inteiro...");
            keyBoard.next();
        }

        System.out.println("     Ótimo! E agora, qual é a distancia que queres que eles precorram?");

        do {
            if (distance != 0) {
                System.out.println("                    Ehhh!! A distancia mínima é de 100mm");
            }
            distance = keyBoard.nextInt();
        } while (distance < 100);

        System.out.println("                          Vamos a isso então! :D");
        System.out.println("\n");
        System.out.println("\n");

        route route = new route(distance);
        Thread thread[] = new Thread[competitors];

        do {
            thread[counter] = new Thread(new snail(counter + 1, route));
            System.out.println("Caracol #" + (counter + 1) + " pronto para correr!");
            counter++;
        } while (counter < competitors);

        for (counter = 0; counter < competitors; counter++) {
            thread[counter].start();
        }


    }
}
