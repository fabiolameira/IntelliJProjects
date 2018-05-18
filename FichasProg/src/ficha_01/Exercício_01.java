/**
 * 
 */
package ficha_01;

/**
 * @author darkingw
 *
 */
public class Exercício_01
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 1 - Formatação à esquerda:
		System.out.printf("\n %s %s %s Anos", "Leonardo", "- Lourinhã", "20");
		System.out.printf("\n %s %s %s Anos", "Rafael", "- Portalegre", "20");
		System.out.printf("\n %s %s %s Anos", "Miguel", "- Portalgere", "18");
		System.out.printf("\n %s %s %s Anos", "Célcio", "- S. Tomé e Principe", "17");
		
		//Parágrafo
		System.out.printf("\n");
		
		// 1 - Formatação à direita:
		System.out.printf("\n %92s %s %s Anos", "Leonardo", "- Lourinhã", "20");
		System.out.printf("\n %90s %s %s Anos", "Rafael", "- Portalegre", "20");
		System.out.printf("\n %90s %s %s Anos", "Miguel", "- Portalgere", "18");
		System.out.printf("\n %90s %s %s Anos", "Célcio", "- S. Tomé e Principe", "17");
		
		// 1 Tabulação:
		System.out.printf("\n \t %s %s Anos", "Leonardo", "- Lourinhã", "20");
		System.out.printf("\n \t %s %s Anos", "Rafael", "- Portalegre", "20");
		System.out.printf("\n \t %s %s Anos", "Miguel", "- Portalgere", "18");
		System.out.printf("\n \t %s %s Anos", "Célcio", "- S. Tomé e Principe", "17");
						
		
		
	}
	
}
