/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7 - Cálculo do ano bissexto:
		Scanner teclado = new Scanner(System.in);
		double ano;
		
		System.out.println("Indique o ano:");
		ano = teclado.nextDouble();
		
		if (ano % 4 == 0 || ano % 100 == 0 && ano % 400 != 0)
			System.out.println("O ano é Bissexto :D");
		else
			System.out.println("O ano não é Bissexto :C");
		
		teclado.close();
						
	}

}
