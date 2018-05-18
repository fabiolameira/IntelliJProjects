/**
 * 
 */
package ficha_10;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que Diz a Distância entre dois números num plano:
		Scanner teclado = new Scanner(System.in);
		int x1, y1, x2, y2;
		double d;
		
		System.out.println("Indique as Coordenadas X e Y do Primeiro Ponto");
		x1 = teclado.nextInt();
		y1 = teclado.nextInt();
		
		System.out.println("Indique as Coordenadas X e Y do Segundo Ponto");
		x2 = teclado.nextInt();
		y2 = teclado.nextInt();
		d = Distancia(x1, y1, x2, y2);
		
		System.out.println("A distância entre os Dois pontos é: " +d);
		teclado.close();
		
	}
	
	public static double Distancia(int x1, int y1, int x2, int y2) {
		double distancia;
		distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow(y2 - y1, 2));
		return distancia;
	}

}
