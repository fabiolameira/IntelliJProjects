/**
 * 
 */
package ficha_04;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 4 - Cálculo do IMC:
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique o seu Peso (Kg):");
		peso = teclado.nextDouble();
		
		System.out.println("Indique a sua Altura (M):");
		altura = teclado.nextDouble();
		imc = peso/Math.pow(altura, 2);
		
		if (imc<18.5)
			System.out.println(" O seu Indice de Massa Corporal é: " +imc +" - Magreza");
		
		else
			if (imc>=18.5 && imc<=25)
				System.out.println("O seu Indice de Massa Corporal é: " +imc +" - Saudavél");
			else
				if (imc>25 && imc<30)
					System.out.println("O seu Indice de Massa Corporal é: " +imc +" - Sobrepeso");
				else
					if (imc>=30)
						System.out.println("O seu Indice de Massa Corporal é: " +imc +" - Obesidade");
					else
						System.out.println("Os valores Introduzidos podem não estar corretos.");
		teclado.close();		

	}

}
