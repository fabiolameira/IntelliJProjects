/**
 * 
 */
package exemplo_04;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class If_Else_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Pedir ao User 2 inteiros e um factor real.
		//Em seguida, multiplicamos o maior inteiro pelo factor e adicionamos o menor ao factor real:
		int a, b;
		double f, multiplica, adiciona;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique dois número inteiros e um real:");
		a = teclado.nextInt();
		b = teclado.nextInt();
		f = teclado.nextDouble();
			
		if (a>=b) {
			multiplica = a*f;
			adiciona = b+f;
			System.out.println(a + " * " +f +" = " + multiplica);
			System.out.println(b + " + " + f + " = " + adiciona);
		}
		else {
			multiplica = b*f;
			adiciona = a+f;
			System.out.println(b + " * " +f +" = " + multiplica);
			System.out.println(a + " + " + f + " = " + adiciona);
		}
		
		teclado.close();
	}

}
