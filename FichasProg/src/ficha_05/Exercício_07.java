/**
 * 
 */
package ficha_05;
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
		// 7 - Cálculo da classificação final na Cadeira:
		int t01, t02, t03, clfint;
		double clf;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Indique a Nota do 1º Teste:");
		t01 = teclado.nextInt();
				
		System.out.println("Indique a Nota do 2º Teste:");
		t02 = teclado.nextInt();
			
		System.out.println("Indique a Nota do 3º Teste:");
		t03 = teclado.nextInt();
				
		clf = (t01*0.20)+(t02*0.50)+(t03*0.30);
		clfint = (int) Math.round(clf);
		
		switch(clfint){
		case 1: case 2: case 3:System.out.println("Reprovado à cadeira com " +clf +" Valores.");break;
		case 4: case 5: case 6:System.out.println("Reprovado à cadeira com " +clf +" Valores.");break;
		case 7: case 8: case 9:System.out.println("Reprovado à cadeira com " +clf +" Valores.");break;
		case 10: case 11: case 12:System.out.println("Aprovado à cadeira com " +clf +" Valores.");break;
		case 13: case 14: case 15:System.out.println("Aprovado à cadeira com " +clf +" Valores.");break;
		case 16: case 17: case 18:System.out.println("Aprovado à cadeira com " +clf +" Valores.");break;
		case 19: case 20:System.out.println("Aprovado à cadeira com " +clf +" Valores.");break;
		default:System.out.println("As notas inseridas podem não estar corretas");break;
		}
		teclado.close();
	}

}
