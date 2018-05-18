/**
 * 
 */
package exemplo_06;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class While_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que pede ao user o tamanho do quadrado que quer fazer:
		Scanner teclado = new Scanner(System.in);
		int d, c = 0, cc = 0;
		System.out.println("Caro utilizador, indique a dimensão do Quadrado:");
		d = teclado.nextInt();
		
		while (c < d) { //(d = dimensão) Escreve linhas
			while (cc < d) { //Escreve dentro de uma linhas	
				System.out.print("# ");
				cc++;//Contador do contador
			}
			System.out.println();
			cc = 0;
			c++;
		}
		
		teclado.close();
	}

}
