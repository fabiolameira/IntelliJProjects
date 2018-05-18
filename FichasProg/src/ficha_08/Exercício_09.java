/**
 * 
 */
package ficha_08;

import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 9 - Programa que Lê comprimento e largura, e desenha um Quadrado com XO: 
		Scanner teclado = new Scanner(System.in);
		int cl, ca, larg, alt;
		
		System.out.println("Indique a Altura:");
		alt = teclado.nextInt();
		
		System.out.println("Indique a Largura:");
		larg = teclado.nextInt();
		
		for (ca = alt; ca >= 1; ca--) {
			for (cl = larg; cl >= 1; cl--) {
				if ((ca + cl)%2 == 0)
				System.out.printf("X ");
				else
					System.out.printf("O ");
			}
			System.out.println();
		}
		teclado.close();
	}

}
