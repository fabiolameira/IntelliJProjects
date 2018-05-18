/**
 * 
 */
package ficha_07;
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
		// 2 - Programa que lê dois números e desenha rectângulo de N por N com *:
		Scanner teclado = new Scanner(System.in);
		int n01, n02, c = 1, cc = 1;
		
		System.out.println("Indique a dimensão x:");
		n01 = teclado.nextInt();
		
		System.out.println("Indique a dimensão y:");
		n02 = teclado.nextInt();
		
		while(c <= n01) {
			while (cc <= n02) {
				System.out.print("* ");
				cc++;
			}
			System.out.println();
			cc = 1;
			c++;
		}
		
		teclado.close();
	}

}
