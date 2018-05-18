package classes;

public class Quadrado {

    // Atributos (Propriedades, Dados, Variáveis de Estado, esc.)
    private double lado;

    // Métodos (Construtores, Get/Set, Outros)
    Quadrado() {
        this.setLado(1);
    }

    Quadrado(double lado) {
        this.setLado(lado);
    }
    public void setLado (double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("O N�mero n�o � V�lido");
        }
    }

    public double getLado() {
        return this.lado;
    }

    public double getArea() {
        return this.getLado() * this.getLado();
    }

}
