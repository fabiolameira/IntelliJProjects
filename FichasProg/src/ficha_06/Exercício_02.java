/**
 * 
 */
package ficha_06;
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
		// 2 - Codificador de Letras
		Scanner teclado = new Scanner(System.in);
		char car;
		
		System.out.println("Indique a Letra:");
		car = teclado.next().charAt(0);
		
		if (car >= 65 && car <= 90 || car >= 97 && car <= 122) {
			switch (car) {
			case 'z':System.out.println("a");break;
			case 'Z':System.out.println("A");break;
			default:{
				car++;
				System.out.println(car);
			}
			}
		}
		else
			System.out.println(car);
		teclado.close();
	}

}
