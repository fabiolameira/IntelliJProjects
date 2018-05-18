package Teste_03;

public class Exercicio_03_Main {

    public static void main(String[] args) {
        Exercicio_03_Lampada lampada01 = new Exercicio_03_Lampada();

        System.out.println(lampada01.MostrarDados());
        System.out.println("\n");

        lampada01.AlterarEstado();
        System.out.println(lampada01.MostrarDados());
        System.out.println("\n");

        lampada01.AlterarLuminusidadeUp();
        System.out.println(lampada01.MostrarDados());
        System.out.println("\n");

        lampada01.AlterarLuminusidadeDown();
        System.out.println(lampada01.MostrarDados());
        System.out.println("\n");

    }


}
