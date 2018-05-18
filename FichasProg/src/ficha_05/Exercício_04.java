/**
 * 
 */
package ficha_05;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4 - Conversor de Notas para Escala Europeia de Classificações:
		Scanner teclado = new Scanner(System.in);
		double notad;
		int nota;
		
		System.out.println("Indique a Nota");
		notad = teclado.nextDouble();
		nota = (int) Math.round(notad);
		
		switch(nota){
		case 0: case 1: case 2:System.out.println("Escala Europeia de Classificações: F");break;
		case 3: case 4: case 5:System.out.println("Escala Europeia de Classificações: F");break;
		case 6: case 7: case 8:System.out.println("Escala Europeia de Classificações: F");break;
		case 9: case 10: case 11: case 12:System.out.println("Escala Europeia de Classificações: F");break;
		case 13: case 14:System.out.println("Escala Europeia de Classificações: D");break;
		case 15: case 16:System.out.println("Escala Europeia de Classificações: C");break;
		case 17: case 18:System.out.println("Escala Europeia de Classificações: B");break;
		case 19: case 20:System.out.println("Escala Europeia de Classificações: A");break;
		default:System.out.println("A nota inserida é inválida");break;
		}
		teclado.close();
	}

}
