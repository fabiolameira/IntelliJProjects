/**
 * 
 */
package ficha_06;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3 - Menu de Jogo:
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		System.out.println("Rust v1.1.2 Beta");
		System.out.println("Bem Vindo ao Rust, selecione a opção pretendida:");
		System.out.println("(1) SinglePlayer");
		System.out.println("(2) MultiPlayer");
		System.out.println("(3) LAN - Configurações");
		System.out.println("(4) Rust Community");
		System.out.println("(5) Rust Wiki");
		opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:System.out.println("No modo de jogo SinglePlayer podes criar um mapa aleatório ou personalisado.");break;
		case 2:System.out.println("No modo MultiPlayer podes jogar contra uma quantidade imensa de jogadores do mundo.");break;
		case 3:System.out.println("Configurações para Jogar em LAN.");break;
		case 4:System.out.println("Na comunidade Rust podes participar em eventos e GiveAways.");break;
		case 5:System.out.println("Rust Wiki contém tuturiais sobre o jogo.");break;
		default:System.out.println("A opção indicada não é válida.");break;
		}
		teclado.close();

	}

}
