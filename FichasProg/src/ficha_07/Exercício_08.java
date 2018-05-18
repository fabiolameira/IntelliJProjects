/**
 * 
 */
package ficha_07;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8 - Programa que lê texto escrito pelo user e conta as palavras:
		Scanner teclado = new Scanner(System.in);
		String palavra = " ";
		int numpalavras = 0;
		System.out.println("Escreva um texto (Quando terminar, escreva ZZ):");

		while(!(palavra.equals("ZZ") || palavra.equals("zz"))) {
			palavra = teclado.next();
			numpalavras ++;
		}
		System.out.println("O seu text tem " +(numpalavras-1) + " Palavras");
		teclado.close();
	}

}
