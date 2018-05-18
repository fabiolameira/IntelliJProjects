package ficha_10;
import java.util.Scanner;
public class Exercício_01 {
	/**
	 * Este código foi adaptado de código desenvolvido por Graham Mitchell 
	 * disponível em http://programmingbydoing.com/
	 * A utilização do código é feita ao abrigo da respectiva licença 
	 */
	public static void main( String[] args )
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		System.out.println( "1. Borboleta " );
		System.out.println( "2. Elefante  " );
		System.out.println( "3. Urso de Peluche" );
		System.out.println( "4. Cobra     " );
		
		System.out.print( "\nQue animal deseja desenhar? " );
		opcao = teclado.nextInt();
		System.out.println();
		
		if ( opcao == 1 )
		{
			borboleta();
		}
		else if ( opcao == 2 )
		{
			elefante();
		}
		else if ( opcao == 3 )
		{
			 urso_de_peluche();
		}
		else if ( opcao == 4 )
		{
			 cobra();
		}
		else 
		{
			System.out.println( "Lamento, opãoo não disponível. " );
		}

		System.out.println( "\nAdeus! :D" );
		teclado.close();
	}
	
	public static void borboleta()
	{
		System.out.println("  .==-.                   .-==.     ");
		System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
		System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
		System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
		System.out.println("      `._... .q(_)p. ..._.'         ");
		System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
		System.out.println("        .\"\"' .'|=|`. `\"\".       ");
		System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
		System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
		System.out.println("      \\O `::/       \\::' O/       ");
		System.out.println("       \"\"--'         `--\"\"      ");
	}
	
	public static void elefante()
	{
		System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
		System.out.println("   _.-'         \\ __...----...__ /         '-._");
		System.out.println(" .'      .:::...,'              ',...:::.      '.");
		System.out.println("(     .'``'''::;                  ;::'''``'.     )");
		System.out.println(" \\             '-)              (-'             /");
		System.out.println("  \\             /                \\             /");
		System.out.println("   \\          .'.-.            .-.'.          /");
		System.out.println("    \\         | \\0|            |0/ |         /");
		System.out.println("    |          \\  |   .-==-.   |  /          |");
		System.out.println("     \\          `/`;          ;`\\`          /");
		System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
		System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
		System.out.println("               / /`;   .==.   ;`\\ \\");
		System.out.println("         .---./_/   \\  .==.  /   \\ \\");
		System.out.println("        / '.    `-.__)       |    `\"");
		System.out.println("       | =(`-.        '==.   ;");
		System.out.println("        \\  '. `-.           /");
		System.out.println("         \\_:_)   `\"--.....-'");
	}
	
	public static void urso_de_peluche()
	{
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("               `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");
		
	}
	
	public static void cobra()
	{
		System.out.println("         ,,'6''-,.");
		System.out.println("        <====,.;;--.");
		System.out.println("        _`---===. \"\"\"==__");
		System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("     |( @@@  |===|  @@@  ||");
		System.out.println("      \\\\ @@   |===|  @@  //");
		System.out.println("        \\\\ @@ |===|@@@ //");
		System.out.println("         \\\\  |===|  //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
		System.out.println("             |==||                           `\\   \\");
		System.out.println("            |==| |                             )   |");
		System.out.println("           |==| |       _____         ______,--'   '");
		System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
		System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
		System.out.println("                \"\"\"\"		");
	}

}
