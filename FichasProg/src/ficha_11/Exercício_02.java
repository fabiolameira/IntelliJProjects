/**
 * 
 */
package ficha_11;
import java.time.*;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2 - Programa que Guarda Dados da Data de Nascimento e do Genero de 10 Pessoas:
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		int c, id, dim = 3;
		boolean maioridade;
		char resposta;
		LocalDate DataNascimento[] = new LocalDate[dim];
		char Sexo[] = new char[dim];
		
		for(c = 0; c < dim; c++) {
			System.out.printf("Elemento " +(c + 1) +": Data de Nascimento (dia mês ano)");
			dia = teclado.nextInt();
			mes = teclado.nextInt();
			ano = teclado.nextInt();
			DataNascimento[c].of(ano, mes, dia);
			
			do {
			System.out.printf("\nElemento " +(c + 1) +": Género (M/F)");
			Sexo[c] = teclado.next().charAt(0);
			} while(Sexo[c] != 'M' && Sexo[c] != 'm' && Sexo[c] != 'F' && Sexo[c] != 'f');
		}
		
		do {
			System.out.printf("Indique o ID da Pessoa");
			id = teclado.nextInt();
			maioridade = InfoMaioridade(DataNascimento[id - 1]);
			System.out.println("Maioridade da Pessoa ID" +id +maioridade);
			System.out.println("Sexo da Pessoa ID" +id +Sexo[id - 1]);
			System.out.println("Deseja Continuar (S = Sim | N = Não)?");
			resposta = teclado.next().charAt(0);
		} while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n');
		
		teclado.close();

	}
	
	public static boolean InfoMaioridade(LocalDate datanascimento) {
		LocalDate dataatual = LocalDate.now();
		LocalDate datamaioridade = dataatual.minusYears(18);
		
		boolean maioridade;
		
		if (datanascimento.isBefore(datamaioridade))
			maioridade = true;
		else
			maioridade = false;
		
		return maioridade;
	}

}
