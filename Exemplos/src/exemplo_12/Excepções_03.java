/**
 * 
 */
package exemplo_12;

/**
 * @author FábioLameira
 *
 */
public class Excepções_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = {10, 20, 30, 40};
		
		try {
			System.out.println(num[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("We got an error: ");
			System.out.println(e.getMessage());
			System.out.println("O índice do array deve ser entre 0 e " +(num.length-1));
		}
		finally {
			System.out.println("Mas o programa continua...");
		}
		System.out.println("E agora, finalmente, o programa termina");
	}

}
