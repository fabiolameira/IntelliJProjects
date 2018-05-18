/**
 * 
 */
package ficha_12;

import java.util.Scanner;

/**
 * @author FábioLameira
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, dim = 12;
		boolean valida = false;
		String mes[] = new String[dim];
		
		mes[0] = "Janeiro";
		mes[1] = "Fevereiro";
		mes[2] = "Março";
		mes[3] = "Abril";
		mes[4] = "Maio";
		mes[5] = "Junho";
		mes[6] = "Julho";
		mes[7] = "Agosto";
		mes[8] = "Setembro";
		mes[9] = "Outubro";
		mes[10] = "Novembro";
		mes[11] = "Dezembro";

		do {
			try {
				System.out.println("Indique o Número do Mês");
				i = teclado.nextInt();
				System.out.println("O mês " +i +" é " +mes[i-1]);
				valida = !valida;
			} catch (Exception e) {
				System.out.println("Tem de Indicar um Mês entre 1 e 12 :P");
			} 
		} while (!valida);
		teclado.close();
	}

}
