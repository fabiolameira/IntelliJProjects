package ficha_13_ex1;

public class Ponto2D {
	private double x;
	private double y;
	
	// Construtor Ponto2D
	Ponto2D (){
		this.x = 1;
		this.y = 1;
	}
	
	// Construtor Ponto2D com Variáveis Entrada
	Ponto2D (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Acessor setX
	private void setX (double x) {
		this.x = x;
	}
	
	// Acessor setY
	private void setY (double y) {
		this.y = y;
	}
	
	// Acessor getX
	public double getX() {
		return this.x;
	}
	
	// Acessor getY
	public double getY() {
		return this.y;
	}
	
	// Acessor getDistancia com valores de Entrada
	public double getDistancia (double x, double y) {
		double result;
		result = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow(this.y - y, 2));
		return result;
	}
	
	// Acessor getDistancia sem valores de Entrada (Polimorfismo)
	public double getDistancia() {
		double result;
		result = getDistancia(0, 0);
		return result;
	}
}
