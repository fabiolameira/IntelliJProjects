/**
 * 
 */
package ficha_10;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7 - Reformulação do Exercício_4 da ficha_5:
		Scanner teclado = new Scanner(System.in);
		double notad;
		int c, alunos, nota;
		String NotaFinal;
		
		System.out.println("Indique o número de Alunos:");
		alunos = teclado.nextInt();
		
		for (c = alunos; c > 0; c--) {
		System.out.println("Indique a Nota");
		notad = teclado.nextDouble();
		nota = (int) Math.round(notad);
		NotaFinal = ClassificaçãoFinal(nota);
		System.out.println("Classificação Final: " +NotaFinal);
		System.out.println();
		}
		teclado.close();
	}
	
	public static String ClassificaçãoFinal(int nota) {
		String NotaFinal;
		
		switch(nota){
		case 0: case 1: case 2:NotaFinal = "F";break;
		case 3: case 4: case 5:NotaFinal = "F";break;
		case 6: case 7: case 8:NotaFinal = "F";break;
		case 9: case 10: case 11: case 12:NotaFinal = "F";break;
		case 13: case 14:NotaFinal = "D";break;
		case 15: case 16:NotaFinal = "C";break;
		case 17: case 18:NotaFinal = "B";break;
		case 19: case 20:NotaFinal = "A";break;
		default:NotaFinal = "A nota inserida é inválida";break;
		}
		
		return NotaFinal;
	}

}
