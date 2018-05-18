package exemplo_05;
import java.util.Scanner;
public class SwitchCase_03 {

	public static void main(String[] args) 
	{
		char letra;
		Scanner teclado = new Scanner(System.in);
		//letra = args[0].charAt(0);
		System.out.println("indique uma letra");
		//System.out.println("letra"+letra);
		letra= teclado.next().charAt(0);
		
		switch(letra) {
		case 'a': ;
		case 'A': ;
		case 'e': ;
		case 'E': ;
		case 'i': ;
		case 'I': ;
		case 'o': ;
		case 'O': ;
		case 'u': ;
		case'U': System.out.println("é letra vogal");break;
		default : System.out.print("não é vogal");
		}
		teclado.close();

	}

}
