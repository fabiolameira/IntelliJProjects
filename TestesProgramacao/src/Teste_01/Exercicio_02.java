package Teste_01;
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        // 02 - Programa do Assistente Digital:
        Scanner teclado = new Scanner(System.in);
        int diaatual, mesatual, diaevento, mesevento, diadif, mesdif;
        String evento;

        System.out.println("Indique o Dia e o Mês Atual:");
        diaatual = teclado.nextInt();
        mesatual = teclado.nextInt();

        System.out.println("Indique o Nome do Evento");
        evento = teclado.next();

        System.out.println("Indique o Dia e o Mês do Evento");
        diaevento = teclado.nextInt();
        mesevento = teclado.nextInt();

        diadif = diaevento - diaatual;
        mesdif = mesevento - mesatual;

        if (diaevento < diaatual && mesevento <= mesatual)
            System.out.println("O " +evento +" já Passou");
        else
        if (diaevento > diaatual && mesevento >= mesatual)
            System.out.println("Faltam " +mesdif +" Meses e " +diadif +" Dias para o " +evento);
        else
        if (diaevento < diaatual && mesevento > mesatual)
            System.out.println("Faltam " +mesdif +" Meses e " +diadif +" Dias para o " +evento);
        else
            System.out.println("O Evento é Hoje");

        teclado.close();
    }

}
