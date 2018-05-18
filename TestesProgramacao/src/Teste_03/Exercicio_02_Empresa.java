package Teste_03;

public class Exercicio_02_Empresa {

    public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//		String nome, funcao;
//		int horasmensais, contador = 0;
//		double salariohora;
//		
//		System.out.println("Indique quantos Funcionários quer registar na sua empresa :D");
//		contador = teclado.nextInt();
//		
//		do {
//			System.out.println("Indique o nome do Funcionário:");
//			nome = teclado.next();
//			System.out.println("Indique a Função do Funcionário:");
//			funcao = teclado.next();
//			System.out.println("Indique as Horas Mensais:");
//			horasmensais = teclado.nextInt();
//			System.out.println("Indique o Salário por hora:");
//			salariohora = teclado.nextDouble();
//			Funcionário funcionário100 = new Funcionário (nome, funcao, horasmensais, salariohora);
//			contador --;
//		} while (contador > 0);

        Exercicio_02_Funcionarios funcionário01 = new Exercicio_02_Funcionarios ("José Batáguas", "Operário", 160, 4.50);
        Exercicio_02_Funcionarios funcionário02 = new Exercicio_02_Funcionarios ("Helena Marques", "Secretaria", 160, 5.80);

        System.out.println(funcionário01.MostrarDados());
        System.out.println("O Salário Mensal do Funcionário " +funcionário01.get_nome() +" é de " +funcionário01.CalculaSalário() +" Euros");

        System.out.println(funcionário02.MostrarDados());
        System.out.println("O Salário Mensal do Funcionário " +funcionário02.get_nome() +" é de " +funcionário02.CalculaSalário() +" Euros");


    }
    
}
