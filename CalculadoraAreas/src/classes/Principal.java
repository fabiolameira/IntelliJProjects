package classes;

public class Principal {

    public static void main(String[] args) {
        // Instanciação dos Objetos
        Quadrado q = new Quadrado(5);
        Quadrado q2 = new Quadrado();
        Circulo c = new Circulo(3);
        Circulo c2 = new Circulo();
        Triangulo t = new Triangulo(3, 4);
        Triangulo t2 = new Triangulo();

        // Uso de Valores
        System.out.println(q.getArea());
        System.out.println(q2.getArea());
        System.out.println(c.getArea());
        System.out.println(c2.getArea());
        System.out.println(t.getArea());
        System.out.println(t2.getArea());


    }

}
