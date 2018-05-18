package ficha_05;
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
		
		switch(dia0){
		case 0:System.out.println("O dia da Semana é Domingo.");break;
		case 1:System.out.println("O dia da Semana é Segunda-Feira.");break;
		case 2:System.out.println("O dia da Semana é Terça-Feira.");break;
		case 3:System.out.println("O dia da Semana é Quarta-Feira.");break;
		case 4:System.out.println("O dia da Semana é Quinta-Feira.");break;
		case 5:System.out.println("O dia da Semana é Sexta-Feira.");break;
		case 6:System.out.println("O dia da Semana é Sábado.");break;
		default:System.out.println("A data que inseriu não é válida");break;
		}
		teclado.close();
		
	}

}