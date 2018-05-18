/**
 * 
 */
package ficha_08;

import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 10 - Programa que
		Scanner teclado = new Scanner(System.in);
		int cl, ca, larg, alt;
		
		System.out.println("Indique a Altura:");
		alt = teclado.nextInt();
		
		System.out.println("Indique a Largura:");
		larg = teclado.nextInt();
		
		for (ca = alt; ca >= 1; ca--) {
			for (cl = larg; cl >= 1; cl--) {
				if (ca >= cl)
				System.out.printf("* ");
				else
					System.out.printf(". ");
			}
			System.out.println();
		}
		teclado.close();
	}

}