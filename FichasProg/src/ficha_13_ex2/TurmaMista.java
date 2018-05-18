package ficha_13_ex2;
// Criar dois objetos da Classe Aluno
public class TurmaMista {

	public static void main(String[] args) {
		
		Aluno aluno0 = new Aluno("Manel Digital", 1, true, 2016, 14);
		Aluno aluno1 = new Aluno("Maria Analógica", 2, false, 2016, 14);
		System.out.println(aluno0.toString());
		System.out.println(aluno1.toString());
		
	}

}