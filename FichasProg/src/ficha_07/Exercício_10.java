/**
 * 
 */
package ficha_07;

import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 10 - Programa que lê texto escrito pelo user, e conta as palavras, as letras, as vogais:
		Scanner teclado = new Scanner(System.in);
		String palavra;
		int numpalavras = 0, numletras = 0, tamanhopalavra, i = 0, numvogais = 0;
		int av = 0, ev = 0, iv = 0, ov = 0, uv = 0;
		char letra;
		System.out.println("Escreva um texo (Quando terminar escreva ZZ);");
		
		while(true) {
			palavra = teclado.next();
			if(palavra.equals("ZZ") || palavra.equals("zz")) break;
			numpalavras ++;
			tamanhopalavra = palavra.length();
			
			while(i < palavra.length()) {
				letra = palavra.charAt(i);
				i ++;
				if(letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122) numletras ++;
				
				switch(letra) {
				case 97: numvogais ++; av ++; break;
				case 101: numvogais ++; ev ++; break;
				case 105: numvogais ++; iv ++; break;
				case 111: numvogais ++; ov ++; break;
				case 117: numvogais ++; uv ++; break;
				case 65: numvogais ++; av ++; break;
				case 69: numvogais ++; ev ++; break;
				case 73: numvogais ++; iv ++; break;
				case 79: numvogais ++; ov ++; break;
				case 85: numvogais ++; uv ++; break;
				}
			}
		i = 0;
		}
		System.out.println("O seu texto tem:");
		System.out.println(numpalavras +" Palavras.");
		System.out.println(numletras +" Letras.");
		System.out.println(numvogais +" Vogais.");
		System.out.println(av +" Vogais A");
		System.out.println(ev +" Vogais E");
		System.out.println(iv +" Vogais I");
		System.out.println(ov +" Vogais O");
		System.out.println(uv +" Vogais U");
		teclado.close();
	}

}