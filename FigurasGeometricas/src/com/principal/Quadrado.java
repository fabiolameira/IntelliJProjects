package com.principal;

public class Quadrado extends Retangulo {

    Quadrado(double lado1) {
        this.setLado1(lado1);
    }

    public double getArea() {
        return this.getLado1() * this.getLado1();
    }

    public double getPerimetro() {
        return this.getLado1() * 4;
    }



}
