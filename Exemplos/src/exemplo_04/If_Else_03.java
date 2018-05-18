/**
 * 
 */
package exemplo_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class If_Else_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// If Else - Escolha do número maior:
		double a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique dois números:");
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		
		if (a>b)
			System.out.println("Número maior: " +a);
		else
			if (b>a)
				System.out.println("Número maior: " +b);
			else
				System.out.println("Os números são Iguais: " +a +" e " +b);
		
		teclado.close();
	}

}
