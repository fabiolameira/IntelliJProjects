package com;

public class Main {

    public static void main(String[] args) {
        Lampada lampada01 = new Lampada();

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
