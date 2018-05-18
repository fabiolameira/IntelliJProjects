/**
 * 
 */
package ficha_13_ex2;

/**
 * nome, n�mero matricula, data nascimento, ebolseiro, ano matricula, codigo curso
 * Codigo curso : 
 * 					0 - CTeSP;
 * 					1 - Licenciatura
 * 					2 - Mestrado
 *
 */
public class Aluno {
	
	private String nome;
	private int nMatricula;
	//data de nascimento
	private boolean isBolseiro;
	private int AnoMatricula;
	private int CodigoCurso;
	
	public Aluno(String nome, int nMatricula, boolean isBolseiro, int AnoMatricula, int CodigoCurso) {
		this.nome = nome;
		this.nMatricula = nMatricula;
		this.isBolseiro = isBolseiro;
		this.AnoMatricula = AnoMatricula;
		this.CodigoCurso = CodigoCurso;
	}
	
	private String set_nome(String nome) {
		return this.nome=nome;
	}
	
	public String get_nome() {
		return this.nome;
	}
	
	private int set_nMatricula(int nmatricula){
		return this.nMatricula= nmatricula;
	}
	
	private int get_nMatricula(){
		return this.nMatricula;
	}
	
	public boolean set_isBolseiro(boolean bolsa) {
		return this.isBolseiro=bolsa;
	}
	
	public boolean get_isBolseiro() {
		return this.isBolseiro;
	}
	
	private int set_AnoMatricula(int amatricula){
		return this.AnoMatricula= amatricula;
	}
	
	private int get_AnoMatricula(){
		return this.AnoMatricula;
	}
	
	public int calculaPropina() {
		int vPropina = 0;
		if (this.CodigoCurso%10 == 0) vPropina = 700;
		else if (this.CodigoCurso == 1) vPropina = 1200;
		else if (this.CodigoCurso == 2) vPropina = 2000;
		if (this.isBolseiro) vPropina /= 2;
		return vPropina;
	}
	
	public String toString() {
		String info = "";
		info += "Aluno " +this.nome +" Nº: " +this.nMatricula +"\nCurso " +this.CodigoCurso;
		info += "\nAno Matricula " +this.AnoMatricula;
		if (this.isBolseiro) info += "\nÉ Bolseiro";
		else info += "\nPropina a Pagar: " +calculaPropina();
		return info;
	}
	
}
