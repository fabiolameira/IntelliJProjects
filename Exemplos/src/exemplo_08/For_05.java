/**
 * 
 */
package exemplo_08;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class For_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calcular o Factorial de um número:
		int n, c, fatorial = 1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva um número inteiro positivo:");
		n = teclado.nextInt();
		
		for (c = n; c >= 1; c--) {
			fatorial = fatorial * c;
			System.out.println("Passo " +c +" fatorial ==> " +fatorial);
		}
		System.out.println("Fatorial de " +n +": " +fatorial);
		teclado.close();
	}

}
