/**
 * 
 */
package ficha_07;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4 - Programa que pede números e calcula média, min, e máximo:
		Scanner teclado = new Scanner(System.in);
		int num, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, soma = 0, c, cf;
		double med;
		
		System.out.println("Indique quantos valores deseja inserir:");
		c = teclado.nextInt();
		cf = c;
		System.out.println("Indique os números (separados por Espaços:");
		while(c > 0) {
			num = teclado.nextInt();
			min = Math.min(num, min);
			max = Math.max(num, max);
			soma = soma + num;
			c--;
		}
		med = soma / cf;
		System.out.println("Número Mínimo: " +min);
		System.out.println("Número Máximo: " +max);
		System.out.println("Média: " +med);
		teclado.close();
	}

}
