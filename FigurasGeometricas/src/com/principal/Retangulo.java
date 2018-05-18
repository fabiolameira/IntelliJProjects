package com.principal;

public class Retangulo {

    private double lado1;
    private double lado2;

    Retangulo(double lado1, double lado2){
        this.setLado1(lado1);
        this.setLado2(lado2);
    }

    Retangulo(){
        this.setLado1(1);
        this.setLado2(1);
    }

    public double getLado1(){
        return this.lado1;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado2(){
        return this.lado2;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double getArea(){
        return (this.getLado1() * this.getLado2());
    }

    public double getPerimetro(){
        return (this.getLado1() * 2) + (this.getLado2() * 2);
    }
}
