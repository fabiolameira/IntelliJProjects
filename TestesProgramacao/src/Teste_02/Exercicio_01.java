package Teste_02;
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        // Exercício 1
        Scanner teclado = new Scanner(System.in);
        int cap, l, c;
        String capital;
        char res;
        float media;
        String Capitais[] = new String [16];
        float PercipitaçãoAno[][] = new float [16][3];

        Capitais[0] = "Guarda";
        Capitais[1] = "Porto";
        Capitais[2] = "Aveiro";
        Capitais[3] = "Coimbra";
        Capitais[4] = "Leiria";
        Capitais[5] = "Setubal";
        Capitais[6] = "Santarém";
        Capitais[7] = "Lisboa";
        Capitais[8] = "Évora";
        Capitais[9] = "Beja";
        Capitais[10] = "Portalegre";
        Capitais[11] = "Faro";
        Capitais[12] = "Castelo Branco";
        Capitais[13] = "Braga";
        Capitais[14] = "Bragança";
        Capitais[15] = "Viana do Castelo";

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 16; c++) {
                PercipitaçãoAno[c][l] = (float) (Math.random()*1000 + 500);
            }
        }

        do {
            cap = 20;
            System.out.println("Indique a Capital de Distrito (Ex: Guarda):");
            capital = teclado.next();

            switch(capital) {
                case "Guarda": cap = 0;break;
                case "Porto": cap = 1;break;
                case "Aveiro": cap = 2;break;
                case "Coimbra": cap = 3;break;
                case "Leiria": cap = 4;break;
                case "Setúbal": cap = 5;break;
                case "Santarém": cap = 6;break;
                case "Lisboa": cap = 7;break;
                case "Évora": cap = 8;break;
                case "Beja": cap = 9;break;
                case "Portalegre": cap = 10;break;
                case "Faro": cap = 11;break;
                case "Castelo Branco": cap = 12;break;
                case "Braga": cap = 13;break;
                case "Bragança": cap = 14;break;
                case "Viana do Castelo": cap = 15;break;
                default: {
                    System.out.println("A Capital de Distrito não é Válida (Escreva a Primeria Letra Maiúscula).");
                    System.out.println();break;
                }
            }

            System.out.println("Níveis de Percipitação para " +Capitais[cap] +":");
            System.out.println("2014: " +PercipitaçãoAno[cap][0] +" ml");
            System.out.println("2015: " +PercipitaçãoAno[cap][1] +" ml");
            System.out.println("2016: " +PercipitaçãoAno[cap][2] +" ml");
            media = (PercipitaçãoAno[cap][0] + PercipitaçãoAno[cap][1] + PercipitaçãoAno[cap][2])/3;
            System.out.println();
            System.out.println("Média dos 3 Anos: " +media +" ml");


            System.out.println();
            System.out.println("Deseja continuar? (S = Sim | N = Não)");
            res = teclado.next().charAt(0);
        }
        while (res == 's' || res == 'S');
        teclado.close();

    }

}
