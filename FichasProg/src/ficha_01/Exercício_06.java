/**
 * 
 */
package ficha_01;

/**
 * @author darkingw
 *
 */
public class Exercício_06 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 6 - Funções matemáticas com ferramentas Math
		double math01 = Math.pow(3, 5);
		System.out.printf(" 3 elevado a 5: %.1f", math01);
		double math02 = Math.sqrt(125);
		System.out.printf("\n Raiz Quadrada de 125: %.1f", math02);
		double math03 = Math.max(34,43);
		System.out.printf("\n Valor máximo entre 34 e 43: %.1f", math03);
		
		// Println - Desvantagem: Não dá para arredondar os números
		System.out.println("\n");
		System.out.println(" 3 elevado a 5: "+math01);
		System.out.println(" Raiz Quadrada de 125 : "+math02);
		System.out.println(" Valor máximo entre 34 e 43 : "+math03);		
		
	}
	
}