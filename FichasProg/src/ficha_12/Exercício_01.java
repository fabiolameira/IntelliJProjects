/**
 * 
 */
package ficha_12;
import java.util.*;
/**
 * @author FábioLameira
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char cat = ' ';
		boolean valida = false;
		
		do {
			try {
				System.out.println("Categoria: ");
				cat = teclado.next().toUpperCase().charAt(0);
				valida = cat == 'C' || cat == 'D' || cat == 'E';
				if (!valida)
					throw new Exception();
			}

			catch (Exception e) {
				System.out.println("ERRO! => Categoria deve ser C, D, E");
				System.out.println("Tente de novo.");
			} 
		} while (!valida);
		System.out.println("Categoria Validada: " +cat);
		teclado.close();
	}

}
