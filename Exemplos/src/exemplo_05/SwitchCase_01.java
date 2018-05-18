package exemplo_05;

public class SwitchCase_01 {

	public static void main(String[] args) 
	{
		// Switch Case - Argumentos Necessários
		int nota;
		nota =Integer.parseInt(args[0]);
		switch(nota) {
		case 5: System.out.println("podes comprar bilhete para cinema");break;
		case 10: System.out.println("podes comprar 2 bilhetes de cinema");break;
		case 20: System.out.println("podes levar a familia ao cinema. Esquece as pipocas");break;
		case 50: System.out.println("podes levar a familia e comprar pipocas");break;
		case 100: System.out.println("esquece o cinema, podes ir aos atores");break;
		case 500: System.out.println("podes ir a londres");break;
		default : System.out.println("Essa nota é falsa");break;

		}
		
		
	}

}
