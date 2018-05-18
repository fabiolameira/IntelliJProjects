package principal;

public class Exceptions {

    public static void main (String[] args) {

        int a = 20;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por Zero. Corrija.");
        } catch (Exception e) {
            System.out.println("Erro não especificado");
        }

        System.out.println("Resultado: " +c);
    }

}
