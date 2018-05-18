/**
 * 
 */
package ficha_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 11 - Velociade do Vento e Furacões
		Scanner teclado = new Scanner(System.in);
		double vel;
		
		System.out.println("Indique a velocidade do Vento:");
		vel = teclado.nextDouble();
		
		if (vel >= 119 && vel < 153)
			System.out.println("A Velocidade do vento é " +vel +" km/h: Furacão de Categoria 1");
		else
			if (vel >= 154 && vel < 177)
				System.out.println("A Velocidade do vento é " +vel +" km/h: Furacão de Categoria 2");
			else
				if (vel >= 178 && vel < 210)
					System.out.println("A Velocidade do vento é " +vel +" km/h: Furacão de Categoria 3");
				else
					if (vel >= 211 && vel < 249)
						System.out.println("A Velocidade do vento é " +vel +" km/h: Furacão de Categoria 4");
					else
						if (vel > 249)
							System.out.println("A Velocidade do vento é " +vel +" km/h: Furacão de Categoria 5");
						else
							System.out.println("A Velocidade do vento é " +vel +" km/h");
		teclado.close();

	}

}
