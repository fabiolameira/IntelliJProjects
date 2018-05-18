/**
 * 
 */
package exemplo_03;
// Importação de Uma classe (Scanner) de uma Biblioteca(Java.util):
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Uso de argumentos para interagir com o User: (run configurations)
		System.out.println("Bem Vinda ao CTeSP de DWDM, "+ args[0]);
		System.out.println("Bem Vindos ao CTeSP de DWDM, "+ args[0] + " e " + args[1]);
		
		int idade01 = Integer.parseInt(args[2]);
		System.out.printf("Você tem %d Anos", idade01);
		System.out.println("\n");
		
		//Uso da Classe Scanner:
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		System.out.println("Qual é a tua idade?");
		idade = teclado.nextInt();
		
		System.out.println("Valor da variável idade: " + idade);
		teclado.close();
		
	}

}