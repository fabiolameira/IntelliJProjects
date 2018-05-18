/**
 * 
 */
package ficha_08;

/**
 * @author darkingw
 *
 */
public class Exercício_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6 - Programa que Calcula a previsão de salário ao fim de 5 anos:
		int c; 
		float salario = 1400;
		
		for (c = 1; c <= 5; c++) {
			
			if (c == 2)
					salario += salario*0.015;
				else
					if(c > 2)
						salario += salario*0.018;
			
			System.out.println("O salário Previsto ao fim de " +c +" anos, é de: " +salario +" Euros");
		}
	}

}
