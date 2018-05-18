/**
 * 
 */
package ficha_08;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3 - Programa que lê um número N e depois uma sequência de N inteiros e depois apresenta a Média, o MIN e O MAX:
		Scanner teclado = new Scanner(System.in);
		int c, n, num, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, posmin = 0, posmax = 0;
		double soma = 0;
		
		System.out.println("Indique Quantos Valores Deseja Inserir");
		n = teclado.nextInt();
		
		System.out.println("Indique os " +n +" Valores");
		
		for (c = 1; c <= n; c++) {
			num = teclado.nextInt();
			soma = soma + num;
			if (num < min) posmin = c;
			min = Math.min(num, min);
			if (num > max) posmax = c;
			max = Math.max(num, max);
		}
		
		System.out.println("Média ==> " +(soma/n));
		System.out.println("Número Mínimo ==> " +min);
		System.out.println("Número Máximo ==> " +max);
		System.out.println("Posição do Número Mínimo ==> " +posmin);
		System.out.println("Posição do Número Máximo ==> " +posmax);
		teclado.close();
	}

}
