/**
 * 
 */
package ficha_08;
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
		// 4 - Programa que lê idade dos alundos e calcula a idade mínima, a máxima, a média e conta os Maiores de Idade:
		Scanner teclado = new Scanner(System.in);
		int c, n, idade, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, m18 = 0;
		double soma = 0;
		
		System.out.println("Indique o número de Alunos:");
		n = teclado.nextInt();
		
		System.out.println("Indique a Idade de cada um dos Alunos");
		
		for (c = 1; c <= n; c++) {
			idade = teclado.nextInt();
			if (idade >= 18) m18++;
			soma = soma + idade;
			min = Math.min(idade, min);
			max = Math.max(idade, max);
		}
		
		System.out.println("Idade Média ==> " +(soma/n));
		System.out.println("Idade mais Baixa ==> " +min);
		System.out.println("Idade mais Alta ==> " +max);
		System.out.println("Número de Alunos Maiores de Idade ==> " +m18);
		teclado.close();
	}

}
