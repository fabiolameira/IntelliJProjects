package Teste_01;
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        // 01 - Programa dos Estados de Espírito
        Scanner teclado = new Scanner(System.in);
        char letra;
        System.out.println("Indique o Seu Estado de Espirito (Radiante, Divertido, Melancâlico, Aborrecido, Furioso):");
        letra = teclado.next().charAt(0);

        switch (letra) {
            case 'r': System.out.println("Ouça ColdPlay"); break;
            case 'R': System.out.println("Ouça ColdPlay"); break;
            case 'd': System.out.println("Ouça Avicci"); break;
            case 'D': System.out.println("Ouça Avicci"); break;
            case 'm': System.out.println("Ouça James Arthur ou Sam Smith"); break;
            case 'M': System.out.println("Ouça James Arthur ou Sam Smith"); break;
            case 'a': System.out.println("Ouça Queen??"); break;
            case 'A': System.out.println("Ouça Queen?"); break;
            case 'f': System.out.println("Ouça AvengedSevenFold"); break;
            case 'F': System.out.println("Ouça AvengedSevenFold"); break;
            default: System.out.println("O estado de espírito introduzido não é válido");
        }
        teclado.close();
    }

}
