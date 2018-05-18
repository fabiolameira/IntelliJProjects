/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7 - Ler 10 números para um array e calcular:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 10;
		double array[] = new double[dim];
		double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
		double med, var = 0, acima_med = 0, abaixo_med = 0, delta;
		double delta_acima = Double.MAX_VALUE, delta_abaixo = Double.MAX_VALUE, soma = 0;
		double maisPR_acima = 0, maisPR_abaixo = 0;
		
		System.out.println("Escreva 10 Valores");
		
		for (i = 0; i < 10; i++) {
			array[i] = teclado.nextDouble();
			soma += array[i];
			if (array[i] > max) max = array[i];
			if (array[i] < min) min = array[i];
		}
		med = soma / dim;
		
		for(i = 0; i < dim; i++) {
			var += Math.pow(med-array[i],2);
			
			if(array[i] > med) acima_med ++;
			else if (array[i] < med) abaixo_med ++;
			
			delta = array[i] - med;
			if (delta > 0) { // números acima da média
				if (delta < delta_acima) maisPR_acima = array[i];
			}
			
			if (delta < 0) { // número abaixo da média
				if (Math.abs(delta) < delta_abaixo) maisPR_abaixo = array[i];
			}
		}
		var = var / dim;
		System.out.println("Média: " +med);
		System.out.println("Variância: " +var);
		System.out.println("Quantidade de Números acima da média: " +acima_med);
		System.out.println("Quantidade de Números abaixo da média: " +abaixo_med);
		System.out.println("Número mais próximo da Média (acima) " +maisPR_acima);
		System.out.println("Número mais próximo da Média (abaixo) " +maisPR_abaixo);
		System.out.println("Mínimo " +min);
		System.out.println("Máximo " +max);
		teclado.close();
	}

}
