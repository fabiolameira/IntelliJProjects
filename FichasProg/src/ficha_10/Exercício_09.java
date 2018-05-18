/**
 * 
 */
package ficha_10;
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
		// 9 - Programa que Converte Euros em Escudos:
		Scanner teclado = new Scanner(System.in);
		double euro, escudo;
		
		System.out.println("Indique o Valor (em Euros €) que deseja Converter para Escudo:");
		euro = teclado.nextDouble();
		escudo = ConversorEURtoESC(euro);
		System.out.println(+euro +"€ = " +escudo +" Escudos");
		teclado.close();
	}
	
	public static double ConversorEURtoESC(double euro) {
		double escudo;
		escudo = euro * 200.482;
		return escudo;
	}
}
