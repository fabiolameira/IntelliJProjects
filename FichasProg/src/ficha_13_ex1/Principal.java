package ficha_13_ex1;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.println("Indique as Coordenadas X e Y do 1º Ponto");
		x = teclado.nextDouble();
		y = teclado.nextDouble();
		
		Ponto2D p = new Ponto2D(x, y);
		
		System.out.println("Indique as Coordenadas X e Y do 2º Ponto");
		x = teclado.nextDouble();
		y = teclado.nextDouble();
		
		System.out.println("Distância entre o Ponto e a Origem: " +p.getDistancia());
		System.out.println("Distância entre os dois Pontos: " +p.getDistancia(x, y));
		
		teclado.close();
	}

}
