/**
 * 
 */
package exemplo_09;

/**
 * @author darkingw
 *
 */
public class Array_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crirar um Array de  com 10 Elementos e inicializá-los com valores aleatórios.
		System.out.println("*** Array com 10 Elementos de Valores Aleatórios  ***");
		int i, dim = 10;
		double random[] = new double[dim];
		
		// Inicializar o Array com Valores Aleatórios:
		for (i = 0; i < dim; i++) {
			random[i] = Math.random();
			System.out.println("Random[" +i +"] = " +random[i]);
		}

		// Calcular o valor mínimo e máximo no array:
		System.out.println("\n*** Calcular o valor mínimo e máximo no array ***");
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		
		for (i = 0; i < dim; i++) {
			if (random[i] < min) min = random[i];
			if (random[i] > max) max = random[i];
		}
		System.out.println("Min ==> " +min);
		System.out.println("Max ==> " +max);
		
		// Escrever os Valores do Array por ordem Inversa:
		System.out.println("\n*** Imprimir Array por ordem Inversa ***");
		for (i = dim - 1; i >= 0; i--) {
			random[i] = Math.random();
			System.out.println("Random[" +i +"] = " +random[i]);
		}
		
		// Inverter os Valores do Array:
		System.out.println("\n*** Imprimir o Array Invertido ***");
		double aux;
		
		for (i = 0; i < dim / 2; i++) {
			aux = random[i];
			random[i] = random[dim - 1 - i];
			random[dim - 1 - i] = aux;
		}
		for (i = dim - 1; i >= 0; i--) {
			random[i] = Math.random();
			System.out.println("Random[" +i +"] = " +random[i]);
		}
		
		// Copiar os Valores do Array para outro Array:
		System.out.println("\n*** Imprimir Cópia do Array (Invertido) ***");
		double copy[] = new double[dim];
		
		for (i = 0; i < dim; i++) {
			copy[i] = random[i];
			System.out.println("Copy[" +i +"] = " +copy[i]);
		}
	}

}