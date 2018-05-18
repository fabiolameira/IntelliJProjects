package	exemplo_05;

public class SwitchCase_02 {

	public static void main(String[] args) 
	{
		// Switch Case - Argumentos Necessários
		int nota;
		nota =Integer.parseInt(args[0]);
		switch(nota) {
		case 1: ;
		case 2: System.out.println("reprovado");break;
		case 3: ;
		case 4: ;
		case 5: System.out.println("aprovado");break;
		default: System.out.println("nota invalida");
        }
		
	}

}
