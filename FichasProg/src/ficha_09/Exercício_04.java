/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4 - Lê Array de 10Char e copia pela ordem inversa:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 10;
		char array[] = new char[dim];
		
		for (i = 0; i < dim; i++) {
			System.out.println("Indique um char:");
			array[i] = teclado.nextLine().charAt(0);
		}

		// Copiar para Outro Array, Invertendo os Valores:
		char copy[] = new char[dim];
		for (i = 0; i < dim; i++) {
			copy[i] = array[dim - 1 - i];
			System.out.println("Copy[" +i +"] = " +copy[i]);
		}
		teclado.close();

	}

}
