/**
 * 
 */
package ficha_08;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8 - Programa que Lê comprimento e largura, e desenha os contornos de um quadrado:
		Scanner teclado = new Scanner(System.in);
		int cl, ca, larg, alt;
		
		System.out.println("Indique a Altura:");
		alt = teclado.nextInt();
		
		System.out.println("Indique a Largura:");
		larg = teclado.nextInt();
		
		for (ca = alt; ca >= 1; ca--) {
			for (cl = larg; cl >= 1; cl--) {
				if ((ca == 1) || (ca == alt) || ((cl == 1 || cl == larg) && (ca != alt && ca != 1)))
				System.out.printf("# ");
				else
					System.out.printf("  ");
			}
			System.out.println();
		}
		teclado.close();
	}

}
