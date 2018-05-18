/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 8 - Lançamento de dois dados e a sua soma:
		int d01, d02;
		d01 = (int) (Math.random()*6+1);
		d02 = (int) (Math.random()*6+1);
		System.out.println("Valor do 1º Dado: " +d01);
		System.out.println("Valor do 2º Dado: " +d02);
		System.out.println("Soma do valor dos dois dados: " +(d01+d02));

	}

}
