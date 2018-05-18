package com.principal;

public class Triangulo {

    private double base;
    private double altura;

    Triangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase (double base) {
            this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura (double altura) {
            this.altura = altura;
    }

    public double getArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    //public double getPerimetro(){
    //    return ();
    //}

    public void trocaAlturaComBase(){
        this.base = this.altura;
        this.altura = this.base;
    }


}
