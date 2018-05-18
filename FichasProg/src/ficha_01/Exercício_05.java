/**
 * 
 */
package ficha_01;

/**
 * @author darkingw
 *
 */
public class Exercício_05
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//5 - Valor lógico True or False - Boolean: %b
		boolean valorl01 = 10==13;
		System.out.printf(" 10==13 - %b", valorl01);
		boolean valorl02 = 7!=17;
		System.out.printf("\n 7!=17 - %b", valorl02);
		boolean valorl03 = 23!=3;
		System.out.printf("\n 23!=3 - %b", valorl03);
		boolean valorl04 = 4>5 & 5>10;
		System.out.printf("\n 4>5 && 5>10 - %b", valorl04);
		boolean valorl05 = 7>5 && 10>5;
		System.out.printf("\n 7>5 && 10>5 - %b", valorl05);
		boolean valorl06 = 40<100|60>100;
		System.out.printf("\n 40<100 || 60>100 - %b", valorl06);
		boolean valorl07 = 40<100 && 60>100;
		System.out.printf("\n 40<100 && 60>100 - %b", valorl07);
		boolean valorl08 = 40<100 && 60>100;
		System.out.printf("\n Não 40<100 && 60>100 - %b", !valorl08);
				
	}
	
}