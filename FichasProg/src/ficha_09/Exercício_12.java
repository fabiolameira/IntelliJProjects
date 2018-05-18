/**
 * 
 */
package ficha_09;
import java.util.Scanner;

/**
 * @author darkingw
 *
 */
public class Exercício_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 12 - Programa que lê e guarda as notas de dois trabalhos e as imprime aleatóriamente:
		Scanner teclado = new Scanner(System.in);
		int dimc = 2, diml = 10;
		float notas[][] = new float [dimc][diml];
		int l = 0, c = 0, aluno;
		float media;
		char res = 'S';
		
		for (l = 0; l < diml; l++) {
			for (c = 0; c < dimc; c++) {
				notas[c][l] = (float) (Math.random() *20);
			}
		}
		
		do {
		c = 0;
		System.out.println("Indique o nº do Aluno (Entre 1 e 10):");
		aluno = teclado.nextInt();
		media = ((notas[0][aluno - 1] + notas[1][aluno - 1]) / 2);
		
		System.out.printf("Nota 1º Trabalho: %.2f %s \n", notas[0][aluno - 1], "Valores");
		System.out.printf("Nota 2º Trabalho: %.2f %s \n", notas[1][aluno - 1], "Valores");
		
		if (media >= 9.5)
		System.out.printf("Aprovado com uma média de: %.2f %s \n", media, "Valores");
		else
			System.out.printf("Reprovado com uma média de: %.2f %s \n", media, "Valores");
		
		System.out.println();
		System.out.println("Deseja continuar? (S = Sim | N = Não)");
		res = teclado.next().charAt(0);
		}
		while (res == 's' || res == 'S');
		teclado.close();
	}

}
