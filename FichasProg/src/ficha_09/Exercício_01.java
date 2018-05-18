/**
 * 
 */
package ficha_09;
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
		// 1 - Escrever Array pela Ordem Inversa:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 10;
		int array[] = new int[dim];
		
		for (i = 0; i < dim; i++) {
			System.out.println("Indique um número:");
			array[i] = teclado.nextInt();
		}
		
		System.out.println("\n*** Números pela Ordem Inversa ***");
		
		for (i = dim - 1; i >= 0; i--) {
			System.out.println("Array[" +i +"] = " +array[i]);
		}
		
		teclado.close();
	}
	
}
