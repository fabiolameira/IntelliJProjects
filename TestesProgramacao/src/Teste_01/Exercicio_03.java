package Teste_01;
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        // 03 - Programa do Risco de Incêncio:
        double t, u, rif;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique a Temperatura do Ar (Graus C):");
        t = teclado.nextDouble();

        System.out.println("Indique a Humidade do Ar (%):");
        u = teclado.nextDouble();
        rif = t/u;

        if (rif < 0.49) {
            System.out.println("Risco de Incêndio Florestal Baixo");
            System.out.println("Valor do RIF ==> " +rif);
        }
        else
        if (rif >= 0.50 && rif <=0.99){
            System.out.println("Risco de Incêndio Florestal Moderado");
            System.out.println("Valor do RIF ==> " +rif);
        }
        else
        if (rif >= 1.00 && rif <= 1.49) {
            System.out.println("Risco de Incêndio Florestal Alto");
            System.out.println("Valor do RIF ==> " +rif);
        }
        else
        if (rif >= 1.50 && rif <= 1.99) {
            System.out.println("Risco de Incêndio Florestal Muito Alto");
            System.out.println("Valor do RIF ==> " +rif);
        }
        else
        if(rif >= 2.00){
            System.out.println("Risco de Incêndio Florestal Extremo");
            System.out.println("Valor do RIF ==> " +rif);
        }
        else
            System.out.println("Os Valores Inseridos não são válidos");
        teclado.close();

    }

}
