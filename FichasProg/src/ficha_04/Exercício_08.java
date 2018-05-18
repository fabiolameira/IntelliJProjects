/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8 - Verificador de Validade de Data:
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		boolean bissexto;
		
		System.out.println("Indique o Dia:");
		dia = teclado.nextInt();
		
		System.out.println("Indique o Mês:");
		mes = teclado.nextInt();
		
		System.out.println("Indique o Ano:");
		ano = teclado.nextInt();
		
		bissexto = (ano % 4 == 0 || ano % 100 == 0 && ano % 400 != 0);
				
		if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia>=1 && dia<=31)
			System.out.println("A data é Válida :D");
		else 
			if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>=1 && dia<=30)
				System.out.println("A data é Válida :D");
			else
				if (bissexto && mes==2 && dia>=1 && dia<=29)
					System.out.println("A data é Válida :D");
				else
					if (!bissexto && mes==2 && dia>=1 && dia<=28)
						System.out.println("A data é Válida :D");
					else
						System.out.println("A data é Inválida :C");
		
		teclado.close();

	}

}
