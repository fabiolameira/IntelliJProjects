/**
 * 
 */
package ficha_06;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 - Leitura de Caracter, Número ou Letra:
		Scanner teclado = new Scanner(System.in);
		char symb;
		
		System.out.println("Indique o símbolo:");
		symb = teclado.next().charAt(0);
		
		if (symb >= 48 && symb <= 57)
			System.out.println("O símbolo indicado é um Número.");
		else
			if (symb >= 65 && symb <=90)
				System.out.println("O símbolo indicado é uma Letra Maiúscula");
			else
				if (symb >= 97 && symb <= 122)
					System.out.println("O símbolo indicádo é uma Letra Minúscula");
				else
					System.out.println("O símbolo indicado é um Caracter");
		teclado.close();
	}

}
