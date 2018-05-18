/**
 * 
 */
package ficha_02;

/**
 * @author darkingw
 *
 */
public class Exercício_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 3 - Argumentos: Coordenada x, Coordenada y
		double x01 = Double.parseDouble(args[0]);
		double y01 = Double.parseDouble(args[1]);
		double dist01 = Math.sqrt(Math.pow(x01,2)+Math.pow(y01, 2));
		System.out.printf("A distancia Euclidiana entre as Cordenadas é: " + dist01);
		
	}

}