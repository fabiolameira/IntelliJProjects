/**
 * 
 */
package ficha_10;
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
		// 8 - Programa que Lê duas Notas e dá a média final:
		Scanner teclado = new Scanner(System.in);
		double trab1, trab2;
		String finalmessage;
		
		System.out.println("Indique a Nota do 1º Trabalho:");
		trab1 = teclado.nextDouble();
		
		System.out.println("Indique a Nota do 2º Trabalho:");
		trab2 = teclado.nextDouble();
		
		finalmessage = Média(trab1, trab2);
		System.out.println(finalmessage);
		teclado.close();
	}
	
	public static String Média(double trab1, double trab2) {
		double media, nota1, nota2;
		String message;
		
		nota1 = trab1 * 0.30;
		nota2 = trab2 * 0.70;
		media = nota1 + nota2;
		
		if (media >= 0 && media < 9.5)
			message = "Reprovado com uma Média de " +media +" Valores.";
		else
			if (media >= 9.5 && media <= 20)
				message = "Aprovado com uma Média de " +media +" Valores.";
			else
				message = "As Notas Inseridas Não são Válidas";
				
		return message;
		
	}

}
