/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 2 - Argumentos: Peso (Kg), Altura (m) - Cálculo do IMC 		
		double imc01 = Double.parseDouble(args[0])/ Math.pow(Double.parseDouble(args[1]),2);
		System.out.printf("O seu peso é " + args[0] + "kg, a sua altura é: " + args[1] + " o seu IMC é: " + imc01 + ".");
		
	}

}
