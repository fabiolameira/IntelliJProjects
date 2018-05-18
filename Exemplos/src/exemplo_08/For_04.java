/**
 * 
 */
package exemplo_08;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class For_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que pede 10 números e soma-os:
		int i, n, soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Escreva um número inteiro");
			n = teclado.nextInt();
			soma = soma + n;
			System.out.println("Passo " +i +" soma ==> " +soma);
		}
		System.out.println("Soma dos 10 Números ==> " +soma);
		teclado.close();
	}

}
