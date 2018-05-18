/**
 * 
 */
package ficha_09;
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
		// 2 - Ler 10 Valores para um Array e fazer uma cópia pela ordem inversa
		Scanner teclado = new Scanner(System.in);
		int i, dim = 10;
		int array[] = new int[dim];
		
		for (i = 0; i < dim; i++) {
			System.out.println("Indique um número:");
			array[i] = teclado.nextInt();
		}

		// Copiar para Outro Array, Invertendo os Valores:
		int copy[] = new int[dim];
		for (i = 0; i < dim; i++) {
			copy[i] = array[dim - 1 - i];
			System.out.println("Copy[" +i +"] = " +copy[i]);
		}
		teclado.close();
	}

}
