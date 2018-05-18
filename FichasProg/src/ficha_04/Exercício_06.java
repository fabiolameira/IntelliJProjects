/**
 * 
 */
package ficha_04;
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
		// 6 - Calculadora Simples:
		Scanner teclado = new Scanner(System.in);
		
		float numero1, numero2;
		char op = 'a';
		
		System.out.println("Indique doius números reais:");
		numero1 = teclado.nextFloat();
		numero2 = teclado.nextFloat();
		
		System.out.println("Indique a operação (+,-,*,/)");
		op = teclado.next().charAt(0);
				
		if (op == '+')
			System.out.println(numero1 +" " +op +" " +numero2 + " = "+(numero1+numero2));
		else
			if (op == '-')
				System.out.println(numero1 +" " +op +" " +numero2 + " = "+(numero1-numero2));
			else
				if (op == '*')
					System.out.println(numero1 +" " +op +" " +numero2 + " = "+(numero1*numero2));
				else
					if ((op == '/') && (numero1 != 0 && numero2 != 0))
						System.out.println(numero1 +" " +op +" " +numero2 + " = "+(numero1/numero2));
					else
						System.out.println("A operação é inválida :C");
					
		teclado.close();
		
	}

}
