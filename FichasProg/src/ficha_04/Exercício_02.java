/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// 2 - Dias do Mês:
	int mes;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Indique o número do Mês:");
	mes = teclado.nextInt();
	
	if (mes==2)
		System.out.println("O mês indicado tem 28 dias :)");
	else
		if (mes==1||mes==3||mes==5||mes==7||mes==9||mes==11)
			System.out.println("O mês tem 31 dias");
		else
			System.out.println("O mês tem 30 dias");

	teclado.close();
	
	}

}
