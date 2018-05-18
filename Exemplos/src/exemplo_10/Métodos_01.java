/**
 * 
 */
package exemplo_10;

/**
 * @author darkingw
 *
 */
public class Métodos_01 {

	/**
	 * @param args
	 */
	// Método que escreve mensagem de Boas Vindas:
	public static void BoasVindas() {
		System.out.println("Seja Bem Vindo... Vamos a Isto?");
	}
	
	// Método que recebe dois números Inteiros e devolve a sua soma:
	public static int Soma(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	// OverLoad de Soma() mas com tipos Double:
	public static double Soma(double a, double b) {
		double resultado;
		resultado = a + b;
		return resultado;
	}
	
	// Método que escreve o resultado de Soma():
	public static void EscreveResultado(int a) {
		System.out.println("O resultado é: " +a);
	}
	
	// OverLoad de EscreveResultado() para Double:
	public static void EscreveResultado(double a) {
		System.out.println("O resultado é: " +a);
	}
	
	public static void main(String[] args) {
		int x = 4, y = 8, soma;
		BoasVindas();
		soma = Soma(x, y);
		System.out.println("A soma de " +x +" + " +y +" é: " +soma);
		System.out.println("A mesma coisa mas Invocando o método EscreveResultado()");
		EscreveResultado(soma);
		System.out.println();
		
		double j = 2, k = 4, somaDouble;
		BoasVindas();
		somaDouble = Soma(j, k);
		System.out.println("A soma de " +j +" + " +k +" é: " +somaDouble);
		System.out.println("A mesma coisa mas Invocando o método EscreveResultado()");
		EscreveResultado(somaDouble);
	}

}
