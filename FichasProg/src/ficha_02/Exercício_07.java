/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 7 - Uso do Random - 5 números aleatórios entre 0 e 1:
		double r01, r02, r03, r04, r05;
		r01 = Math.random();
		r02 = Math.random();		
		r03 = Math.random();
		r04 = Math.random();
		r05 = Math.random();
		
		System.out.printf("Média:" +(r01+r02+r03+r04+r05)/5);
		System.out.print("\nMínimo:" + Math.min(r01, Math.min(r02, Math.min(r03, Math.min(r04, r05)))));
		System.out.print("\nMáximo:" + Math.max(r01, Math.max(r02, Math.max(r03, Math.max(r04, r05)))));
		
	}

}