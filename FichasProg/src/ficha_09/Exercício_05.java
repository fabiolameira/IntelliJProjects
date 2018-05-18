/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 5 - Lê Salário do trabalhador e escreve o salário de todos os meses e o salário anual:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 13;
		double array[] = new double[dim];
		double sa = 0;
				
		for (i = 1; i < dim; i++) {
			System.out.println("Indique o salário para o mês " +i +":");
			array[i] = teclado.nextDouble();
			sa =  sa + array[i];
		}
		for (i = 0; i < dim; i++) {
			System.out.println("Salário no Mês " +i +": " +array[i]);
		}
		System.out.println("Salário Anual ==> " +sa);
		teclado.close();

	}
}
