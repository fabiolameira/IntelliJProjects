/**
 * 
 */
package ficha_07;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 - Programa que lê um número N e uma letra e escreve a letra N vezes:
		Scanner teclado = new Scanner(System.in);
		int n, c = 0;
		char l;
		
		System.out.println("Indique o número Número Inteiro:");
		n = teclado.nextInt();
		
		System.out.println("Indique a Letra:");
		l = teclado.next().charAt(0);
		
		while (c < n) {
			System.out.print(l +" ");
			c++;
		}
		teclado.close();
	}

}
