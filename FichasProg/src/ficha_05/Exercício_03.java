/**
 * 
 */
package ficha_05;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3 - Leitura de letras vogais ou não:
		Scanner teclado = new Scanner(System.in);
		char letra;
		
		System.out.println("Indique uma letra");
		letra = teclado.next().charAt(0);
		
		switch (letra) {
		case 'a':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'e':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'i':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'o':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'u':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'A':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'E':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'I':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'O':System.out.println("A letra " +letra +" é uma Vogal");break;
		case 'U':System.out.println("A letra " +letra +" é uma Vogal");break;
		default:System.out.println("A letra " +letra +" não é uma Vogal");break;
		}
		teclado.close();
	}

}
