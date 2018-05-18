package ficha_12;

public class Exercício_02 {

	public static void main(String[] args) {
		double D[] = {1.0, 3.4, 5.0, 7.6};
		int I[] = new int[D.length];
		int i;
		double desvio = 0;
		
		for (i = 0; i < D.length; i++) {
			
			try {
				I[i] = (int) D[i];
				if (I[i] != D[i]) throw new Exception();
			} 
			
			catch (Exception e) {
				System.out.printf(" Arredondamento de %f para %d", D[i], I[i]);
				desvio += D[i] - I[i];
			}
		}
		System.out.printf("\n Soma dos Desvios: %.3f", desvio);
	}

}
