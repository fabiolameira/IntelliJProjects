package classes;

public class Triangulo {

    // Atributos (Propriedades, Dados, Variáveis de Estado, esc.)
    private double base;
    private double altura;

    // Métodos (Construtores, Get/Set, Outros)
    Triangulo() {
        this.setBase(1);
        this.setAltura(1);
    }

    Triangulo (double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }
    public void setBase (double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("O Número não é Válido");
        }
    }

    public void setAltura (double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("O Número não é Válido");
        }
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

}
