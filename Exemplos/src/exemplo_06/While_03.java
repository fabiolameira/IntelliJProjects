/**
 * 
 */
package exemplo_06;

/**
 * @author darkingw
 *
 */
public class While_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que Escreve os Números de 50 até 0:
		int i = 50;
		
		while (i >= 0) {
			System.out.print(i +" ");
			i--;
			
			//Fazer enter quando passar uma dezena:
			if ((i % 10) == 0)
				System.out.println();
		}

	}

}
