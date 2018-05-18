package ficha_10;
/**
 * Este código foi adaptado de código desenvolvido por Graham Mitchell 
	 * disponível em http://programmingbydoing.com/
	 * A utilização do código é feita ao abrigo da respectiva licença
 */
public class Exercício_02 {

		public static void main( String[] args ) {
			System.out.println("Exemplos de funções.");

			System.out.println();
			System.out.println("Vou gerar de forma aleatória uma letra de A-Z");
			char c = '!';
			c = randchar();
			System.out.println("The character is: " + c );

			System.out.println();
			System.out.println("Agora vou contar de -10 até 10");
			int inicio, fim;
			inicio = -10;
			fim = 10;
			counta(inicio, fim);
			System.out.println("\nQue tal?");

			System.out.println();
			System.out.println("Agora vamos calcular o valor absoluto de um número.");
			int x, y = 99;
			x = -10;
			y = abso(x);
			System.out.println("|" + x + "| = " + y );

			System.out.println();
			System.out.println("That's all.  :");
			credits();
			
		}

		public static void credits() {
			System.out.println();
			System.out.println("programado  por Graham Mitchell");
			System.out.println("adaptado para português por Mónica V. Martins");
			System.out.println("modificado por  [Fábio Lameira]");
			System.out.print("This code is distributed under the terms of the standard ");
			System.out.println("BSD license.  Do with it as you wish.");
		}


		public static char randchar(){	
			int numval;
			char charval;
			
			numval = (int)(Math.random()*26);
			charval = (char) ('A' + numval);

			return charval;
		}

		public static int counta(int inicio, int fim) {
			int ctr;

			ctr = inicio;
			while ( ctr <= fim )
			{
				System.out.print(ctr + " ");
				ctr = ctr+1;
			}

			return ctr;
		}

		public static int abso(int value) {
			int absval;

			if ( value < 0 )
				absval = -value;
			else
				absval = value;

			return absval;
		}

}