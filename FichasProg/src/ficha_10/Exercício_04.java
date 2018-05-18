/**
 * 
 */
package ficha_10;

import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static String NomeDoMes(int i) {
		String mes[] = new String[13];

		mes[0] = "Mês Inválido";
		mes[1] = "Janeiro";
		mes[2] = "Fevereiro";
		mes[3] = "Março";
		mes[4] = "Abril";
		mes[5] = "Maio";
		mes[6] = "Junho";
		mes[7] = "Julho";
		mes[8] = "Agosto";
		mes[9] = "Setembro";
		mes[10] = "Outubro";
		mes[11] = "Novembro";
		mes[12] = "Dezembro";

		return mes[i];
	}
	
	public static void main(String[] args) {
		// 04 - Programa que Recebe número inteiro (entre 1 e 12) e diz o nome do Mês
		Scanner teclado = new Scanner(System.in);
		int i;
		String result;

		System.out.println("Indique o Número do Mês");
		i = teclado.nextInt();
		result = NomeDoMes(i);
		System.out.println("O mês " +i +" é " +result);
		teclado.close();

	}

}
