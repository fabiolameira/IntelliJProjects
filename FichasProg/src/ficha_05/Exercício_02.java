/**
 * 
 */
package ficha_05;
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
		// 2 - Pede Letra e Diz Sexo que a letra Representa:
		Scanner teclado = new Scanner(System.in);
		char letra;
		
		System.out.println("Indique o Sexo (M ou F):");
		letra = teclado.next().charAt(0);
		
		switch (letra) {
		case 'f':System.out.println("Feminino");break;
		case 'F':System.out.println("Feminino");break;
		case 'm':System.out.println("Masculino");break;
		case 'M':System.out.println("Masculino");break;
		default:System.out.println("A letra inserida não é válida");break;
		}
		teclado.close();
	}

}
