/**
 * 
 */
package ficha_07;
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
		// 5 - Programa Que Lê as notas inseridas pelo User e converte para a escala internacional:
		Scanner teclado = new Scanner(System.in);
		int nota;
		char r = 'S';
		
		while (r == 's' || r == 'S') {
			System.out.println("Indique a Nota:");
			nota = teclado.nextInt();
			
			if (nota >= 0 && nota <= 12) 
				System.out.println("Classificação Qualitativa: F");
			else
				if (nota > 12 && nota <= 14)
					System.out.println("Classificação Qualitativa: D");
				else
					if (nota == 15 || nota == 16)
						System.out.println("Classificação Qualitativa: C");
					else
						if (nota == 17 || nota == 18)
							System.out.println("Classificação Qualitativa: B");
						else
							if (nota == 19 || nota == 20)
								System.out.println("Classificação Qualitativa: A");
							else
								System.out.println("A nota inserida não é válida");
			
			System.out.println("Deseja Continuar? (S = Sim | N = Não)");
			r = teclado.next().charAt(0);
		}
			teclado.close();

	}

}
