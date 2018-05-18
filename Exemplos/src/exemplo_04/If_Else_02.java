/**
 * 
 */
package exemplo_04;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class If_Else_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pedir um número e ver se é positivo, negativo ou neutro: if else dentro de if else:
		double a01;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique um número");
		a01 = teclado.nextDouble();
		
		if (a01>0)
			System.out.println("Número positivo :D");
		else {
			if (a01==0)
				System.out.println("Número neutro :|");
			else
				System.out.println("Número negativo :C");
		}
		
		teclado.close();

	}

}
