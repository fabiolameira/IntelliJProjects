/**
 * 
 */
package ficha_09;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6 - Ler 10 números entre 0 e 9 e dizer se algum deles foi repetido, e quantas vezes:
		Scanner teclado = new Scanner(System.in);
		int i, num, dim = 10;
		int array[] = new int[dim];
		
		for (i = 0; i < dim; i++) {
			System.out.println("Indique um número entre 0 e 9:");
			num = teclado.nextInt();
			
			if (num < 0 || num > 9)
				System.out.println("O número Inserido não é válido");
			else
				array[num]++;
			
				
		}
		for (i = 0; i < dim; i++) {
			if (array[i] > 0)
			System.out.println("Repeiu o nº " +i +" ==> " +array[i] +" Vezes");
		}
		teclado.close();
	}

}
