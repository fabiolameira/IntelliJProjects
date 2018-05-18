/**
 * 
 */
package ficha_09;

import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3 - Escrever Array de Char pela Ordem Inversa:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 10;
		char array[] = new char[dim];
		
		for (i = 0; i < dim; i++) {
			System.out.println("Indique um Caracter:");
			array[i] = teclado.nextLine().charAt(0);
		}
		
		System.out.println("\n*** Chars pela Ordem Inversa ***");
		
		for (i = dim - 1; i >= 0; i--) {
			System.out.println("Array[" +i +"] = " +array[i]);
		}
		
		teclado.close();
	}
	
}