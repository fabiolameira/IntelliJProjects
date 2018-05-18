/**
 * 
 */
package ficha_09;
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
		// 9 - Programa que lê valores positivos e negativos, e separa os positivos noutro array:
		Scanner teclado = new Scanner(System.in);
		int i = 0, j = 0, c, dim = 100, dimpos = 0;
		int array[] = new int[dim];
		
		System.out.println("Indique números Inteiros (999 para terminar):");
		
		do {
			array[i] = teclado.nextInt();
			if (array[i] > 0) dimpos++;
			i++;
		} while (array[i - 1] != 999 || i == 100);
		
		c = i - 1;
		
		int positivos[] = new int[dimpos - 1];
		
		for (i = 0; i <  c; i++) {
			if (array[i] > 0) {
				positivos[j] = array[i];
				System.out.println("Positivos[" +j +"] = " +positivos[j]);
				j++;
			}
		}
		teclado.close();
	}

}
