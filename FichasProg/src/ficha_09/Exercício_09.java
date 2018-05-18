/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 9 - Programa que lê número de Mês e Indica o nome do mês:
		Scanner teclado = new Scanner(System.in);
		int i, dim = 13;
		String mes[] = new String[dim];
		
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

		System.out.println("Indique o Número do Mês");
		i = teclado.nextInt();
		
		System.out.println("O mês " +i +" é " +mes[i]);
		teclado.close();
	}

}
