/**
 * 
 */
package exemplo_12;

/**
 * @author FábioLameira
 *
 */
public class Excepções_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 0;
		
		try {
			System.out.println("a / b = " +(a / b));
		} 
		catch (ArithmeticException e) {
			System.out.print("We got an error: ");
			System.out.println(e.getMessage());
			System.out.println("O divisor não pode ser zero");
		}
		finally {
			System.out.println("a + b = " +(a + b));
			System.out.println("a - b = " +(a - b));
			System.out.println("a * b = " +(a * b));
		}
		System.out.println("Programa a Terminar.");
	}

}
