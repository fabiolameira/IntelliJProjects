/**
 * 
 */
package exemplo_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class If_Else_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Uso do if else:
		int a01, b01;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique dois números inteiros;");
		a01 = teclado.nextInt();
		b01 = teclado.nextInt();
		
		if (a01==b01) {
			System.out.println("Os dois números são Iguais");
			System.out.println("Que falta de Imaginação...");
		}
		else {
			System.out.println("Os dois números são Diferentes");
			System.out.println("Viva :3");
		}
		teclado.close();

	}

}
