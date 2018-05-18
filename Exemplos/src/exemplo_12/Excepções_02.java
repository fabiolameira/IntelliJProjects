/**
 * 
 */
package exemplo_12;
import java.util.*;
/**
 * @author FábioLameira
 *
 */
public class Excepções_02 {

	/**
	 * Programa que realiza uma divisão de inteiros, espera que o user insira dos inteiros.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		boolean k = false;
		
		do {
			try {
				System.out.println("Dividendo: ");
				a = teclado.nextInt();
				System.out.println("Divisor");
				b = teclado.nextInt();
				System.out.println("a / b = " +(a / b));
				k = true;
			} 
			catch (InputMismatchException e) {
				System.out.print("We got an error: ");
				System.out.println("Estava à espera de dois números inteiros :C");
				teclado.next();
			} 
			catch (ArithmeticException e) {
				System.out.print("We got an error: ");
				System.out.println("O divisor não pode ser zero.");
			}
		} while (k == false);
		System.out.println("Programa a Terminar.");
		teclado.close();
	}

}
