/**
 * 
 */
package ficha_08;

/**
 * @author darkingw
 *
 */
public class Exercício_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7 - Programa que escreve o Fatorial de Todos os Números entre 1 e 8:
		long c, num, fac = 1;
		
		for (c = 1; c <= 8; c++) {
			num = c;
			fac = 1;
			
			while(num > 0) {
				fac = fac * num;
				num--;
				
			}	
			System.out.println("O Factorial de " +c +" é: " +fac);
		}

	}

}
