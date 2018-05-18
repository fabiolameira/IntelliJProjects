/**
 * 
 */
package ficha_03;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 5 - Conversão de Euros para Libras Esterlinas:
		double eur, lib;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique o valor em Euros:");
		eur = teclado.nextDouble();
		lib = eur*0.89;
		
		System.out.println("O valor indicado em Euros equivale a: " +lib +" Libras Esterlindas");
		teclado.close();
	}

}
