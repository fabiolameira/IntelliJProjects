/**
 * 
 */
package ficha_07;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que lê tesxto escrito pelo user e conta as palavras e as letras:
		Scanner teclado = new Scanner(System.in);
		String palavra;
		int numpalavras = 0, numletras = 0, tamanhopalavra, i = 0;
		char letra;
		System.out.println("Escreva um texo (Quando terminar escreva ZZ);");
		
		while(true) {
			palavra = teclado.next();
			if(palavra.equals("ZZ") || palavra.equals("zz")) break;
			numpalavras ++;
			tamanhopalavra = palavra.length();
			
			while(i < palavra.length()) {
				letra = palavra.charAt(0);
				i ++;
				if(letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122) numletras ++;
			}
		i = 0;
		}
		System.out.println("O seu texto tem:");
		System.out.println(numpalavras +" Palavras.");
		System.out.println(numletras +" Letras.");
		teclado.close();
	}

}
