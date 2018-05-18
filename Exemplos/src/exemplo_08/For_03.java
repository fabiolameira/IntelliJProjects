/**
 * 
 */
package exemplo_08;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class For_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calcular a Soma dos N primeiros números:
		Scanner teclado = new Scanner(System.in);
		int n, c, soma = 0;
		
		System.out.println("Indique um número inteiro:");
		n = teclado.nextInt();
		
		for (c = 1; c <= n; c++) {
			soma = soma +c;
			System.out.println("Passo " +c +" soma ==> " +soma);
		}
		
		System.out.println("Soma dos " +n +" Primeiros Números ==> " +soma);
		teclado.close();
	}

}
