/**
 * 
 */
package exemplo_12;
import java.util.*;
/**
 * @author fabio
 *
 */
public class Excepções_04 {

	/**
	 * Programa que valida a idade iserida.
	 * A idade deve estar compreendida entre 17 anos e os 77.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		boolean valida = false;
		
		try {
			System.out.println("Idade: ");
			x = teclado.nextInt();
			valida = x >= 17 && x <= 77;
			if (!valida) throw new Exception();
		} 
		
		catch (InputMismatchException e) {
			System.out.print("We got an error: ");
			System.out.println("A idade não é um número inteiro");
			teclado.next();
		} 
		
		catch (Exception e) {
			System.out.println("Ops... Ocorreu um erro.");
		}
		System.out.println("Código a terminar.");
		teclado.close();
	}

}
