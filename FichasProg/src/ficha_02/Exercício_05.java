/**
 * 
 */
package ficha_02;
// Importação de Uma classe (Scanner) de uma Biblioteca(Java.util):
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 5 - Números inteiros trocando os seus valores:
		int x,y,d;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique a Coordenada x para o Ponto:");
		x = teclado.nextInt();
		
		System.out.println("\nIndique a Coordenada y para o Ponto:");
		y= teclado.nextInt();
		
		d = x;
		x = y;
		y = d;
		System.out.println("\nCoordenadas Trocadas: x=" +x + " y=" +y);
		teclado.close();
		
	}

}