package com.principal;

public class Circulo {

    private double raio;

    Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio (double raio) {
            this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

    public double getPerimetro(){
        return Math.PI * this.getRaio();
    }

}
