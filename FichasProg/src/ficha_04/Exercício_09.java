/**
 * 
 */
package ficha_04;
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
		// 9 - Programa que diz a idade do User
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano, diaat, mesat, anoat;
						
		System.out.println("Indique o Dia em que Nasceu:");
		dia = teclado.nextInt();
		
		System.out.println("Indique o Mês em que Nasceu:");
		mes = teclado.nextInt();
		
		System.out.println("Indique o Ano em que Nasceu:");
		ano = teclado.nextInt();
		
		diaat = 20;
		mesat = 10;
		anoat = 2017;
		
		if (mes > mesat)
			System.out.println("Você tem " +(anoat-ano-1) + " anos :D");
		else
			if ((dia >= diaat) && mes==mesat)
				System.out.println("Você tem " +(anoat-ano-1) +" anos :D");
			else
				System.out.println("Você tem " +(anoat-ano) +" anos :D");
			
		teclado.close();				
	}

}
