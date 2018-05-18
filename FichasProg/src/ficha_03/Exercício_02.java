/**
 * 
 */
package ficha_03;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2 - Conversor de Graus Centígrados para Graus Fahrenheit:
		double c, f;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique a Temperatura em Graus Centígrados");
		
		c = teclado.nextDouble();
		f = (9/5)*c+32;
		
		System.out.println("A Temperatura em Graus Fahrenheit é: " +f +"F");
		teclado.close();
	}

}
