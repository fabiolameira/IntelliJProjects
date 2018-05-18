/**
 * 
 */
package ficha_07;
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
		// 3 - Programa que lê um número inteiro inserido pelo utilizador e calcula o seu factorial:
		Scanner teclado = new Scanner(System.in);
		long num, fac = 1;
		
		System.out.println("Indique um número Inteiro:");
		num = teclado.nextLong();
		
		while(num > 0) {
			fac = fac * num;
			num--;
		}
		System.out.println("Factorial = " +fac);
		teclado.close();
	}

}
