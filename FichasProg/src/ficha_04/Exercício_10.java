/**
 * 
 */
package ficha_04;
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
		// 10 - Programa que diz a estação do ano:
		Scanner teclado = new Scanner(System.in);
		int dia, mes;
		
		System.out.println("Indique o Dia e o mês:");
		dia = teclado.nextInt();
		mes = teclado.nextInt();
		
		
		if (mes > 12 || dia > 31)
			System.out.println("Data inválida");
		else
		if ((mes >= 3) && (mes <= 5))
			if ((mes == 4 || mes == 5) || (mes == 3 && dia >= 21))
				System.out.println("Primavera");
			else
				System.out.println("Inverno");
		else		
		if ((mes >= 6) && (mes <= 8))
			if ((mes == 7 || mes == 8) || (mes == 6 && dia >= 21))
				System.out.println("Verão");
			else
				System.out.println("Primavera");
		else
		if ((mes >= 9) && (mes <= 10))
			if ((mes == 10 || (mes == 9 && dia >= 21)))
				System.out.println("Outono");
			else 
				System.out.println("Verão");
		else
		if (mes >= 11)
			if (((mes == 11 && dia >= 21) || mes == 12 || mes == 1 || mes == 2) || (mes == 3 && dia <=20))
				System.out.println("Inverno");
			else
				System.out.println("Outono");
																	
		teclado.close();								

	}

}
