/**
 * 
 */
package ficha_08;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2 - Programa que lê um Número N e escreve todos os números Pares de N a 0:
		int n, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique um Número:");
		n = teclado.nextInt();
		
		for (c = n; c >= 0; c--) {
			if (c % 2 == 0)
				System.out.println("Número Par:" +c);
		}

		teclado.close();
	}

}
