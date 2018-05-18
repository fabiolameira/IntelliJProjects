/**
 * 
 */
package ficha_12;
import java.util.*;

/**
 * @author FábioLameira
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, dim = 4;
		int vector[] = new int[dim];
		
		for(i = 0; i < dim; i++) {
			try {
				System.out.println("Indique o Vector[" +i +"]");
				vector[i] = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Detetado erro. Esperávamos um Inteiro");
				System.out.println("Vamos Substituir o Valor por 20");
				vector[i] = 20;
			} 
			
			try {
				if(vector[i] < 0) throw new Exception();
			} catch (Exception e) {
				System.out.println("Detetado erro. Esperávamos um Inteiro Positivo");
				System.out.println("Vamos Substituir o Valor por 10");
				vector[i] = 10;
			}
			
			finally {
				System.out.println("Estamos a multiplicar por 5");
				vector[i] *= 5;
			}
			
		}
		
		System.out.println("Vector Final: ");
		
		for(i = 0; i < dim; i++) {
			System.out.println("Indique o Vector[" +i +"] = " +vector[i]);
		}
		teclado.close();
	}

}
