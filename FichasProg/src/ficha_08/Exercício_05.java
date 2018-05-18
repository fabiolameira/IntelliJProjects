/**
 * 
 */
package ficha_08;

/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 05 - Programa que mostra ao user 20 números aleatórios entre 1 e 100:
		int c, random;
		
		for (c = 0; c <= 19; c++) {
			random = (int) (Math.random() * 100);
			System.out.println("Número Aleatório ==> " +random);
		}
	}

}
