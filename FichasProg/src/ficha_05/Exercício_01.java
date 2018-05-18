/**
 * 
 */
package ficha_05;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 - Leitura por extenso de Número
		Scanner teclado = new Scanner(System.in);
		int nint;
		
		System.out.println("Indique um número inteiro:");
		nint = teclado.nextInt();
		
		switch(nint){
		case 0:System.out.println("Número Zero");break;
		case 1:System.out.println("Número Um");break;
		case 2:System.out.println("Número Dois");break;
		case 3:System.out.println("Número Três");break;
		case 4:System.out.println("Número Quatro");break;
		case 5:System.out.println("Número Cinco");break;
		case 6:System.out.println("Número Seis");break;
		case 7:System.out.println("Número Sete");break;
		case 8:System.out.println("Número Oito");break;
		case 9:System.out.println("Número Nove");break;
		default: System.out.println("Não consigo ler esse número :C");
		}
		teclado.close();		

	}

}
