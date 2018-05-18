/**
 * 
 */
package ficha_07;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6 - Programa que simula cálculadora simples com While:
		Scanner teclado = new Scanner(System.in);
		double n01, n02;
		int key;
		char r = 'S';
		
		do {
		System.out.println("Indique o 1º Valor:");
		n01 = teclado.nextDouble();
		
		System.out.println("Indique a operação (1 para +, 2 para *, 3 para /):");
		key = teclado.nextInt();
		
		System.out.println("Indique o 2º Valor:");
		n02 = teclado.nextDouble();
		
		switch(key) {
		case 1:System.out.println(n01 +" + " +n02 +" = " +(n01+n02));break;
		case 2:System.out.println(n01 +" * " +n02 +" = " +(n01*n02));break;
		case 3:System.out.println(n01 +" / " +n02 +" = " +(n01/n02));break;
		default:System.out.println("A opreação inserida não é válida");break;
		}
		
		System.out.println("Deseja continuar? (S = Sim || N = Não)");
		r = teclado.next().charAt(0);
		
		}while(r == 's' || r == 'S');
		
		teclado.close();
	}

}