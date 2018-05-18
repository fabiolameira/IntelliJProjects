/**
 * 
 */
package ficha_03;
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
		// 1 - Calculadora de Média:
		double teste01, teste02, trabalho01, trabalhofinal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique a Nota do 1º Teste");
		teste01 = teclado.nextDouble();
		
		System.out.println("Indique a Nota do 2º Teste");
		teste02 = teclado.nextDouble();
		
		System.out.println("Indique a Nota do Trabalho");
		trabalho01 = teclado.nextDouble();
		
		System.out.println("Indique a Nota do Trabalho Final");
		trabalhofinal = teclado.nextDouble();
		
		teste01 = teste01*0.15;
		teste02 = teste02*0.15;
		trabalho01 = trabalho01*0.20;
		trabalhofinal = trabalhofinal*0.50;
		
		System.out.println("A Média da Cadeira é de: "+ (teste01+teste02+trabalho01+trabalhofinal));
		teclado.close();
	}

}
