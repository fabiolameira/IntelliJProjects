package Teste_02;
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        // Exercício 2
        Scanner teclado = new Scanner(System.in);
        int res, id = 0, idpresente = 0, cped = 0;
        String nome = " ";
        int presente;

        System.out.println("Sê Bem Vindo :D");
        do {
            System.out.println();
            System.out.println("O que Desejas?");
            System.out.println("1 - Quero Registar-me para o Natal :D");
            System.out.println("2 - Quero Fazer um Pedido de Natal :D");
            System.out.println("3 - Quero Terminal este Programa :C");
            res = teclado.nextInt();

            if (res == 1) {
                switch(id) {
                    case 0: nome = Registo();break;
                    case 1: System.out.println("Já te Registaste, " +nome +".");break;
                    default: System.out.println("Já te Registaste, " +nome +".");break;
                }
                id++;
            }

            else
            if (res == 2) {
                presente = Presente();

                if (idpresente != presente && cped < 3) {
                    Respostas(nome, presente, idpresente);
                    cped++;
                }
                else
                if(idpresente != presente && cped >= 2)
                    System.out.println("Já Fizeste 2 pedidos.");
                else
                    System.out.println("Já Escolheste esse Tipo de Presente... Escolhe Outro");

                idpresente = presente;
            }

        } while (res != 3);

        teclado.close();
    }

    public static String Registo() {
        Scanner teclado = new Scanner(System.in);
        int id = 0;
        String nome;
        System.out.println("Indica-me o teu primeiro Nome:");
        nome = teclado.nextLine();
        System.out.println("Obrigado por te Registares!");
        id ++;
        return nome;
    }

    public static int Presente() {
        Scanner teclado = new Scanner(System.in);
        int presente;
        System.out.println("Que Tipo de Preente Queres de receber?");
        System.out.println("1 - Brinquedos");
        System.out.println("2 - Jogos");
        System.out.println("3 - Livros");
        System.out.println("4 - Equipamentos Eletrónicos");
        System.out.println("5 - Equipamentos Desportivos");
        System.out.println("6 - Paz no Mundo");
        presente = teclado.nextInt();
        return presente;
    }

    public static void Respostas(String nome, int presente, int idpresente) {

        switch (presente) {
            case 1: case 2: case 3: System.out.println("Obrigado Pelo Pedido " +nome +", O teu Presente será Entregue :D");break;
            case 4: case 5: case 6: System.out.println("Oh Oh Oh... Obrigado pelo Pedido " +nome +", na Noite de Natal chegará a tua prenda");break;
            default: System.out.println("Esse Tipo de Presente Não Existe... Escolhe Outro :D");
        }
    }

}
