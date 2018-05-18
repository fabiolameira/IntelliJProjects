package exemplo_01;

public class Printf {


	public static void main(String[] args) {
		
		//O System.out.printf Permite usar as Strings %s, %d, %f, \t (printf - Formated, %s - String, %f - Float, \t - Tab):
		System.out.printf("Caro %s %s, Seja Bem-Vindo!", "Fábio", "Lameira");
		System.out.printf("\n\tNunca mais é hora de almoço...");
		System.out.print("\n");	
		
		System.out.printf("\n_______________________________\n");
		
		System.out.printf("\n%s %s", "Olá", "Adeus");
		System.out.printf("\n%s %s", "Adeus", "Olá");
		System.out.printf("\n%15s %10s", "Olá", "Adeus");
		System.out.printf("\n%15s %10s", "Adeus", "Olá");
	}

}