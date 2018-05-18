/**
 * 
 */
package ficha_01;

/**
 * @author darkingw
 *
 */
public class Exercício_02
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		// 2 - Uso de variáveis byte, short, int, long - para os numeros inteiros: %d
		int idade;
		idade=20;
		System.out.printf(" Idade = %d", idade);
		
		byte numero01;
		numero01=10;
		System.out.printf("\n Numero Byte = %d", numero01);
		
		short numero02 = 32689;
		System.out.printf("\n Numero Short = %d", numero02);
		
		int numero03 = 100000023;
		System.out.printf("\n Numero Int = %d", numero03);
		
		// Uso de variáveis float, double - para os numeros decimais: %f
		float multiplica01 = 10.3f*1240;
		System.out.printf("\n Multiplicação Float = %.1f", multiplica01);
		
		double multiplica02 = 7.8E20;
		System.out.printf("\n Multiplicação Double = %.1f", multiplica02);
		
		//Parágrafo
		System.out.printf("\n");
		
		// 2 - Resolução final
		System.out.printf("\n %d; %d; %d; %.1f; %.1f", numero01, numero02, numero03, multiplica01, multiplica02);
		
		
	}
	
}