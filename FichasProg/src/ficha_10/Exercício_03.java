package ficha_10;

/* Este código foi adaptado de código desenvolvido por Graham Mitchell 
* disponível em http://programmingbydoing.com/
* A utilização do código é feita ao abrigo da respectiva licença
*/

import java.util.Scanner;
public class Exercício_03 {
	
	public static void main( String[] args ) {
		System.out.println("Aqui vamos nós.");
		System.out.println();
		System.out.println("Alguns números aleatórios: ");
		int lo, hi, val1 = 999, val2 = 999;
		lo = 1;
		hi = 10;
		val1 = superrand(lo, hi);
		System.out.println("Primeiro: " + val1 );
		val2 = superrand(hi, lo);
		System.out.println("Segundo: " + val2 );
		if ( val1 == val2 )
			System.out.println("Hey!  São o mesmo!");
		else
			System.out.println("Oh! Não são o mesmo.");

		System.out.println();
		System.out.print("Mais contagens,mas desta vez em intervalos maiores: ");
		conta_por_passos(2,8,2);
		conta_por_passos(10,2,2);

		System.out.println();
		System.out.println("Calcular a nota final (1-5).");
		int a=4,b=3,c=4,d=5,e=2,f=1, result=999;
		result = calcula_nota(a, b, c, d, e, f);
		System.out.println("434521 -> " + result );

		System.out.println();
		System.out.print("E, para terminar, umas mesmo simples. ");

		String nome = "ERROR";
		nome = get_name();
		System.out.println("Hi, " + nome );

		System.out.println();
		System.out.println("Sentes-te com sorte?");
		crash();
		System.out.println();
	}

	public static int superrand(int a, int b) {
		int c;

		if ( a < b )
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;

		return c;
	}

 	public static void conta_por_passos(int primeiro, int ultimo, int passo)	{
		int x;

		if ( primeiro < ultimo) {
			x = primeiro;
			while ( x <= ultimo)
			{
				System.out.print(x + " ");
				x = x + passo;
			}
		}
		else {
			x = primeiro;
			while ( x >= ultimo )
			{
				System.out.print(x + " ");
				x = x - passo;
			}
		}
		System.out.println();
	}

	public static int calcula_nota(int p1, int p2, int p3, int p4, int p5, int p6) {
		int nota_final;

		nota_final = p1 * 6;    // a cotação do primeiro trabalho é seis pontos 
		nota_final = nota_final+ ( p2 * 6 );   // a cotação do segundo trabalho é seis pontos 
		nota_final = nota_final+ ( p3 * 4 );   // a cotação do terceiro trabalho é quatro pontos 
		nota_final = nota_final+ ( p4 * 2 );   // a cotação do quarto trabalho é dois pontos 
		nota_final = nota_final+ ( p5 * 1 );   // a cotação do quinto trabalho é um ponto
		nota_final = nota_final+ ( p6 * 1 );   // a cotação do sexto trabalho é um ponto

		return nota_final;
	}

	public static String get_name() {
		Scanner teclado = new Scanner(System.in);

		String name;
		System.out.print("Insira o seu nome: ");
		name = teclado.next();
		teclado.close();

		return name;
	}

	public static String crash() {
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{
			 
			magic_word = "ganhaste!";
		}
		else
		{
			
			magic_word = "perdeste!";
		}

		System.out.print("Tu " + magic_word);

		return magic_word;
	}
}