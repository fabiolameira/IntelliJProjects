/**
 * 
 */
package ficha_02;
// Importação de Uma classe (Scanner) de uma Biblioteca(Java.util):
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 6 - Dia / Mês / Ano - Dia da Semana:
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano, dia0, mes0, ano0, xd;
		System.out.println("Indique o Dia:");
		dia = teclado.nextInt();
		
		System.out.println("Indique o Mês:");
		mes = teclado.nextInt();
		
		System.out.println("Indique o Ano:");
		ano = teclado.nextInt();
		
		ano0 = ano-(14-mes)/12;
		xd = ano0+ano0/4-ano0/100+ano0/400;
		mes0 = mes+12*((14-mes)/12)-2;
		dia0 = (dia+xd+31*mes0/12)%7;
		
		System.out.println("O dia da Semana é: " +dia0);
		teclado.close();
		
		
	}

}
