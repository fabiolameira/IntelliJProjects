/**
 * 
 */
package exemplo_06;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class While_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pede um número Inteiro N e escreve a soma dos N primeiros números:
		Scanner teclado = new Scanner(System.in);
		int n, c = 0, soma = 0;
		
		System.out.println("Indique um número inteiro:");
		n = teclado.nextInt();
		
		while(c <= n) {
			soma = soma + c;
			System.out.println("Contador: " +c +"   Soma: " +soma);
			c++;
		}
		
		System.out.println("A soma dos " +n +" primeiros números é " +soma);
		teclado.close();
	}

}
