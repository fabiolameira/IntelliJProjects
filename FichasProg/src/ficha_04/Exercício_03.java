/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3 - Média do Aluno
		double nota01, nota02, média;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique as duas notas (entre 0 e 20 Valores):");
		nota01 = teclado.nextDouble();
		nota02 = teclado.nextDouble();
		
		média = (nota01+nota02)/2;
		
		if (nota01<0 || nota01>20 || nota02<0 || nota02>20)
			System.out.println("Notas inválidas");
		
		else
			if (média >= 9.5 && nota01>=7 && nota02>=7)
				System.out.println("Aprovado com " +média +" Valores :D");
			else
				if (média >= 9.5 && (nota01 >= 7.0 || nota02 >= 7.0))
					System.out.println("Reprovado porque não cumpriu a nota mínima nos testes :C");
				else
					System.out.println("Reprovado com " +média +" Valores :C");
		
		teclado.close();

	}

}
