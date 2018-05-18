/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 1 - Argumentos: 1º Nome, Ano de Nascimento
		int idade01 = 2017 - Integer.parseInt(args[1]);
		System.out.println("Bem Vindo ao CTeSP de DWDM "+ args[0] + ", você tem " + idade01 + " anos.");
		
	}

}
