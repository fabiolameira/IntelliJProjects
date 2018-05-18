/**
 * 
 */
package exemplo_04;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class If_Else_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Pedir ao User para inserir 2 Números Reais e determinar se a sua multiplicação é positiva ou negativa:
		double a, b, multiplica;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique dois números positivos ou negativos:");
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		multiplica = a*b;
		
		if (multiplica >0)
			System.out.println("O resultado da Multiplicação é positivo: " +multiplica);
		
		else 
			if (multiplica==0)
				System.out.println("O resultado da Multiplicação é Neutro: " +multiplica);
			else 
				System.out.println("O resultado da Multiplicação é Negativo: " +multiplica);
		
		teclado.close();
	}

}
