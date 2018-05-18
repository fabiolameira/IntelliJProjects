/**
 * 
 */
package ficha_10;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static double AreaTriangulo(double alt, double base) {
		double result;
		result = (alt * base) / 2;
		return result;
	}
	
	public static void main(String[] args) {
		// 5 - Programa que Calcula área de Triangulo.
		Scanner teclado = new Scanner(System.in);
		double alt, base, result;
		
		System.out.println("Indique a Altura e a Base do Triângulo:");
		alt = teclado.nextDouble();
		base = teclado.nextDouble();
		result = AreaTriangulo(alt, base);
		System.out.println("A área do Triângulo é: " +result);
		teclado.close();
	}

}
