/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 5 - Cálculo da classificação final na Cadeira:
		int t01, t02, t03;
		double clf;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique a Nota do 1º Teste:");
		t01 = teclado.nextInt();
		
		System.out.println("Indique a Nota do 2º Teste:");
		t02 = teclado.nextInt();
		
		System.out.println("Indique a Nota do 3º Teste:");
		t03 = teclado.nextInt();
		
		clf = (t01*0.20)+(t02*0.50)+(t03*0.30);
		
		if (clf<9.5) {
			System.out.println("Reprovado à Cadeira :C");
			System.out.println("A sua classificação final é de " +clf +" valores.");
		}
		else
			if (clf>20)
				System.out.println("As notas indicadas podem não estar corretas :|");
			else {
				System.out.println("Aprovado à Cadeira :D");
				System.out.println("A sua classificação final é de " +clf +" valores.");
			}
		teclado.close();
		
	}

}
