/**
 * 
 */
package ficha_10;
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
		// 10 - Programa que Converte Várias Moedas:
		Scanner teclado = new Scanner(System.in);
		int divisa;
		double euro, conv;
		
		System.out.println("Indique para que Moeda Deseja converter Euros:");
		System.out.println("1 - Dólar");
		System.out.println("2 - Libra Estrelina");
		System.out.println("3 - Iene");
		System.out.println("4 - Real");
		divisa = teclado.nextInt();
		
		System.out.println("Indique o Valor em Euros");
		euro = teclado.nextDouble();
		
		switch(divisa) {
		case 1: conv = EURtoDOLAR(euro);
		System.out.println(euro +"€ = " +conv +" Dolars");break;
		
		case 2: conv = EURtoLIBRA(euro);
		System.out.println(euro +"€ = " +conv +" Libras");break;
		
		case 3: conv = EURtoIENE(euro);
		System.out.println(euro +"€ = " +conv +" Ienes");break;
		
		case 4: conv = EURtoREAL(euro);
		System.out.println(euro +"€ = " +conv +" Reais");break;
		
		default: System.out.println("A moeda escolhida não é válida");break;
		
		}
		teclado.close();
	}
	
	public static double EURtoDOLAR(double euro) {
		double dolar;
		dolar = euro * 1.18141;
		return dolar;
	}
	
	public static double EURtoLIBRA(double euro) {
		double libra;
		libra = euro * 0.89;
		return libra;
	}
	
	public static double EURtoIENE(double euro) {
		double iene;
		iene = euro * 132.896;
		return iene;
	}
	
	public static double EURtoREAL(double euro) {
		double real;
		real = euro * 3.88939;
		return real;
	}

}
