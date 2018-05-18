package Teste_01;
import java.util.Scanner;

public class Exercício_04 {

    public static void main(String[] args) {
        // 04 - Programa que conta os números que o user insere:
        Scanner teclado = new Scanner(System.in);
        int num, soma = 0, c = 0, p = 0, n = 0;
        char r = 'S';

        while (r == 's' || r == 'S') {
            System.out.println("Indique o número:");
            num = teclado.nextInt();
            c ++;
            soma = soma + num;

            if(c % 2 == 0)
                p++;

            if(num < 0)
                n++;

            System.out.println("Deseja Continuar? (S = Sim | N = Não)");
            r = teclado.next().charAt(0);
        }
        System.out.println("Inseriu " +c +" Números");
        System.out.println("Soma dos Números ==> " +soma);
        System.out.println("Inseriu " +p +" Números Pares");
        System.out.println("Inseriu " +n +" Números Negativos");

        teclado.close();
    }

}
