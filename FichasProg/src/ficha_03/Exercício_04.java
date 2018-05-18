/**
 * 
 */
package ficha_03;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 4 - Cálculo da Função de X e Y
		double x, y, f, f1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique o valor de x:");
		x = teclado.nextDouble();
		
		System.out.println("Indique o Valor de y:");
		y = teclado.nextDouble();
		
		f1 = y+Math.sqrt(x+y);
		f = Math.pow(f1, 2*x);
		
		System.out.println("O Resultado da Função Matemática é: " +f);
		teclado.close();
		
	}

}
