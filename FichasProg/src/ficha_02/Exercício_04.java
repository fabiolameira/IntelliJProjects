/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 4 - Argumentos: 3 números introduzidos pelo User
		double n01 = Double.parseDouble(args[0]);
		double n02 = Double.parseDouble(args[1]);
		double n03 = Double.parseDouble(args[2]);
		boolean bool01 = n01 == n02;
		boolean bool02 = n01 == n03;
		boolean bool03 = bool02 == bool01;
		System.out.printf("Os três números são iguais? - %b", bool03);
			
	}

}