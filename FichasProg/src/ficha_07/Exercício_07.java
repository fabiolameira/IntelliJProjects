/**
 * 
 */
package ficha_07;
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
		// 7 - Programa que gera número aleatório (entre 1 e 10) e interage com o user até que ele acerte:
		int guess, random;
		random = (int) (Math.random()*10+1);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Boa tarde :D");
		System.out.println("Gerámos um Número Aleatório entre 1 e 10.");
		System.out.println("Consegues adivinhar? Tenta u.u");
	
		do {
			guess = teclado.nextInt();
			
			if (random != guess && (guess == 1 || guess == 6))
				System.out.println("Ehhh :P Errouu! Tenta Outra Vez!");
			else
				if (random != guess && (guess == 2 || guess == 7))
					System.out.println("Não foi desta :C Tenta de Novo!");
				else
					if(random != guess && (guess == 3 || guess == 8))
						System.out.println("Posha :C Que falta de sorte... Tenta de Novo!");
					else
						if(random != guess && (guess == 4 || guess == 9))
							System.out.println("Nop!!! :o Tenta de Novo!");
						else
							if(random != guess && (guess == 5 || guess == 10))
								System.out.println("Não jogues na Loteria hoje... Tenta de Novo!");
							else
								if(guess > 10 || guess < 1)
									System.out.println("És tonto?? É um número entre 1 e 10!!");
								else
									if (random == guess)
										System.out.println("Yeahhh!!! Acertoou Miseráveuu!! *-*");
									else
										System.out.println("Será??? Nahh! Tenta Outra Vez :S");
		} while(random != guess);
		teclado.close();
	}

}
