/**
 * 
 */
package ficha_04;
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
		// 1 - Uso do if else:
		double a01, b01;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Indique dois números;");
		a01 = teclado.nextDouble();
		b01 = teclado.nextDouble();
				
		if (a01==b01)
			System.out.println("Os dois números são Iguais");
		
		else
			if (a01<b01)
				System.out.println("O número mínimo é: " +a01);
			else
				System.out.println("O número mínimo é " +b01);
			
		teclado.close();
		
	}

}
