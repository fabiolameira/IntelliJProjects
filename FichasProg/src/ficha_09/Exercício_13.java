/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dimc = 0, diml = 0;
		int c = 0, l = 0;
		
		System.out.println("Indique quantas Colunas quer no Array:");
		dimc = teclado.nextInt();
		
		System.out.println("Indique quantas Linhas quer no Array:");
		diml = teclado.nextInt();
		
		char letras[][] = new char [dimc][diml];
		for (l = 0; l < diml; l++) {
			for (c = 0; c < dimc; c++) {
				letras[c][l] = (char) (65 + Math.random() * 25);
				System.out.printf(letras[c][l] +" ");
			}
			System.out.println();
		}
		
		System.out.println();

		char inv[][] = new char [diml][dimc];
		for (c = 0; c < dimc; c++) {
			for (l = 0; l < diml; l++) {
				inv[l][c] = letras[c][l];
				System.out.printf(inv[l][c] +" ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
