package classes;

public class Circulo {

    // Atributos (Propriedades, Dados, Variáveis de Estado, esc.)
    private double raio;

    // Métodos (Construtores, Get/Set, Outros)
    Circulo() {
        this.setRaio(1);
    }

    Circulo (double raio) {
        this.setRaio(raio);
    }
    public void setRaio (double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("O N�mero n�o � V�lido");
        }
    }

    public double getRaio() {
        return this.raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

}
