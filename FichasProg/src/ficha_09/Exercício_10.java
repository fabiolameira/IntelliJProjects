/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 10 - Programa que lê dia, mês e ano, e diz o dia da Semana;
		Scanner teclado = new Scanner(System.in);
		int dim = 7, dia, mes, ano;
		int dia0, mes0, ano0, xd;
		
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
		
		String dias[] = new String[dim];
		
		dias[0] = "Domingo";
		dias[1] = "Segunda-Feira";
		dias[2] = "Terça-Feira";
		dias[3] = "Quarta-Feira";
		dias[4] = "Quinta-Feira";
		dias[5] = "Sexta-Feira";
		dias[6] = "Sábado";
		
		System.out.println("O dia da Semana é " +dias[dia0] +" :D");
		teclado.close();
	}

}
