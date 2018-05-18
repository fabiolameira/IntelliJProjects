/**
 * 
 */
package ficha_08;
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
		// 1 - Programa que lê um número e escreve a tabuada dele
		int num, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Diz um número entre 1 e 10");
		num = teclado.nextInt();
		
		for (c = 1; c <= 10; c++) {
			System.out.println(c +" x " +num +" = " +(c*num));
		}

		teclado.close();
	}

}
