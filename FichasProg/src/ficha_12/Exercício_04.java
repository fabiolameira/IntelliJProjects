/**
 * 
 */
package ficha_12;
import java.util.*;
/**
 * @author FábioLameira
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new  Scanner(System.in);
		String dados[] = new String[50];
		String continua = " ";
		boolean erro = true;
		
		int i = 0, contA = 0;
		
		do {
				System.out.println("Nome:");
				dados[i] = teclado.next().toUpperCase();
				if(dados[i].charAt(0) == 'A') contA++;
				i++;
			do {
				try {
					System.out.println("Pretende Continuar?? (SIM/NÃO)");
					continua = teclado.next().toUpperCase();
					if (continua.compareTo("SIM") != 0 && continua.compareTo("NÃO") != 0)
						throw new Exception();
					erro = false;
				} catch (Exception e) {
					System.out.println("A resposta deverá ser 'SIM' ou 'NÃO'");
				} 
			} while(erro);
		} while(continua.equals("SIM"));
		
		System.out.println("Foram indicados " +i +" Nomes");
		System.out.println("dos quais " +contA + " são iniciados por 'A'");
		teclado.close();
	}

}
