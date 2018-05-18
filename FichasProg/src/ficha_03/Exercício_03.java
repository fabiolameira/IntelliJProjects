/**
 * 
 */
package ficha_03;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 3 - Calculadora de Investimentos: Juros a 5%, Prazo 12 Meses
		double capitalinicial, retorno, capitalfinal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique o Valor do Capital Inicial que deseja Investir");
		
		capitalinicial = teclado.nextDouble();
		retorno = (capitalinicial*0.05);
		capitalfinal = capitalinicial+retorno;
		
		System.out.println("Valor do Retorno ao Fim de 12 Meses: " +retorno +"€");
		System.out.println("Valor do Capital ao Fim de 12 Meses: " +capitalfinal +"€");
		teclado.close();
	}

}
