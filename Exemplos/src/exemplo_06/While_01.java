/**
 * 
 */
package exemplo_06;

/**
 * @author darkingw
 *
 */
public class While_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escrever os números inteiros de 10 em 10 até 100:
		int i = 0;
		int v = 0;
		
		while(v <= 100) {
			System.out.println("Contador: " +i +" valor: " +v);
			i++; //i = i + 1
			v = 10 + v; // v += 10
		}
	}

}
