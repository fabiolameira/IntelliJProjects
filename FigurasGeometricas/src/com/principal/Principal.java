package com.principal;

public class Principal {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(3, 4);

        Retangulo r2 = new Retangulo();
        r2.setLado1(5);
        r2.setLado2(5);

        Circulo c1 = new Circulo(3);
        Quadrado q1 = new Quadrado(5);
        Triangulo t1 = new Triangulo(10,4);  //Altura e Base

        System.out.println("Retângulo 1: Área " + r1.getArea() + " Perímetro: " + r1.getPerimetro());
        System.out.println("Retângulo 2: Área " + r2.getArea() + " Perímetro: " + r2.getPerimetro());
        System.out.printf("Círculo 1: Área: %.1f Perímetro: %.1f\n", c1.getArea(), c1.getPerimetro());
        System.out.println("Quadrado 1: Área: " + q1.getArea() + " Perímetro: " + q1.getPerimetro());
        //System.out.printf("Triangulo 1: Área %.1f Perímetro: %.1f\n", t1.getArea(), t1.getPerimetro());

        t1.trocaAlturaComBase();

        //System.out.printf("Triângulo 1: Área: %.1f Perímetro: %.1f\n", t1.getArea(), t1.getPerimetro());
    }
}
