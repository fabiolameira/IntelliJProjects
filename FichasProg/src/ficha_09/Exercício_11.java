/**
 * 
 */
package ficha_09;

/**
 * @author darkingw
 *
 */
public class Exercício_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 11 - Programa que usa um array bidimensional para desenhar um quadrado:
		int dim = 10;
		int quadrado[][] = new int [dim][dim];
		int linha, coluna;
		
		// Prenche os elementos do Array
		for (linha = 0; linha < dim; linha++) { // percorre todas as linhas
			for(coluna = 0; coluna < dim; coluna++) { // percorre todas as colunas
				if(linha >= coluna) quadrado[linha][coluna] = 1;
				else quadrado[linha][coluna] = 0;
			}
		}

		// Imprimir o Array
		for (linha = 0; linha < dim; linha++) { // percorre todas as linhas
			for(coluna = 0; coluna < dim; coluna++) {
				System.out.print(quadrado[linha][coluna] +" ");
			}
			System.out.println();
		}

	}
}
