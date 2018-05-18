/**
 * 
 */
package ficha_05;
import java.util.Scanner;
/**
 * @author darkingw
 *
 */
public class Exercíco_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8 - Escrever por extenso os números de 1 a 99:
		Scanner teclado = new Scanner(System.in);
		int num, d, u;
		
		System.out.print("Indique o Número:");
		num = teclado.nextInt();
		d = num/10;
		u = num%10;
		
		if (d==0 || d==1) {
			switch(num) {
			case 1: System.out.print("Um");break;
			case 2: System.out.print("Dois");break;
			case 3: System.out.print("Três");break;
			case 4: System.out.print("Quatro");break;
			case 5: System.out.print("Cinco");break;
			case 6: System.out.print("Seis");break;
			case 7: System.out.print("Sete");break;
			case 8: System.out.print("Oito");break;
			case 9: System.out.print("Nove");break;
			case 10: System.out.print("Dez");break;
			case 11: System.out.print("Onze");break;
			case 12: System.out.print("Doze");break;
			case 13: System.out.print("Treze");break;
			case 14: System.out.print("Catorze");break;
			case 15: System.out.print("Quinze");break;
			case 16: System.out.print("Dezasseis");break;
			case 17: System.out.print("Dezassete");break;
			case 18: System.out.print("Dezoito");break;
			case 19: System.out.print("Dezanove");break;
			default: System.out.print("Não se escrever esse número :C");break;
			}//switch
		}//if
		else 
			if (d > 1 && d <= 9) {
				switch(d) {
				case 2: System.out.print("Vinte");break;
				case 3: System.out.print("Trinta");break;
				case 4: System.out.print("Quarenta");break;
				case 5: System.out.print("Cinquenta");break;
				case 6: System.out.print("Sessenta");break;
				case 7: System.out.print("Setenta");break;
				case 8: System.out.print("Oitenta");break;
				case 9: System.out.print("Noventa");break;
				}//switch(d)
				
				switch (u) {
				case 0:break;
				case 1: System.out.print(" e Um");break;
				case 2: System.out.print(" e Dois");break;
				case 3: System.out.print(" e Três");break;
				case 4: System.out.print(" e Quatro");break;
				case 5: System.out.print(" e Cinco");break;
				case 6: System.out.print(" e Seis");break;
				case 7: System.out.print(" e Sete");break;
				case 8: System.out.print(" e Oito");break;
				case 9: System.out.print(" e Nove");break;
				}//Switch(u)
				
			}//Else If
			else
				System.out.print("Não sei escrever esse número :C");
		teclado.close();
	}

}
