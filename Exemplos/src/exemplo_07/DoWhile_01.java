/**
 * 
 */
package exemplo_07;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class DoWhile_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pede um número ao User e devolve o seu dobro. Só pára quando o user quiser:
		Scanner teclado = new Scanner(System.in);
		int num;
		char ask;
		
		do {
			System.out.println("Escreva um número Inteiro");
			num = teclado.nextInt();
			
			System.out.println("Dobro: " +(2 * num));
			System.out.println("Pretende Continuar? (S para continuar | Outra para terminar)");
			ask = teclado.next().charAt(0);
		} while(ask == 's' || ask == 'S');
		
		teclado.close();
	}

}
