/**
 * 
 */
package ficha_11;
import java.time.*;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 - Programa que Diz se User tem a ou não Maioridade
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Indique a Sua Data de Nascimento (dia mês ano):");
		dia = teclado.nextInt();
		mes = teclado.nextInt();
		ano = teclado.nextInt();
		
		LocalDateTime dataatual = LocalDateTime.now();
		LocalDateTime datamaioridade = dataatual.minusYears(18);
		LocalDateTime datanascimento = LocalDateTime.of(ano, mes, dia, dataatual.getHour(), dataatual.getMinute());
		
		if (datanascimento.isBefore(datamaioridade))
			System.out.println("O User é Maior de Idade");
		else
			System.out.println("O User é Menor de Idade");
		
		teclado.close();
	}

}
