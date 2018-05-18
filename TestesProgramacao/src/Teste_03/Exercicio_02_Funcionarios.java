package Teste_03;

public class Exercicio_02_Funcionarios {

    // Atributos (Propriedades, Dados, Variáveis de Estado, esc.)
    private String nome;
    private String funcao;
    private int horasmensais;
    private double salariohora;


    // Métodos (Construtores, Get/Set, Outros)
    public Exercicio_02_Funcionarios(String nome, String funcao, int horasmensais, double salariohora) {
        this.nome = nome;
        this.funcao = funcao;
        this.horasmensais = horasmensais;
        this.salariohora = salariohora;
    }

    private String set_nome(String nome) {
        return this.nome = nome;
    }

    public String get_nome() {
        return this.nome;
    }

    private String set_funcao(String funcao) {
        return this.funcao = funcao;
    }

    public String get_funcao() {
        return this.funcao;
    }

    private int set_horasmensais(int horasmensais) {
        return this.horasmensais = horasmensais;
    }

    public int  get_horasmensais() {
        return this.horasmensais;
    }

    private double set_salariohora (double salariohora) {
        return this.salariohora = salariohora;
    }

    public double  get_salariohora() {
        return this.salariohora;
    }

    // Mostrar Dados
    public String MostrarDados() {
        String dados = "";
        dados += "\nNome do Funcionário: " +this.nome ;
        dados += "\nFunção: " +this.funcao;
        dados += "\nHoras Mensais: " +this.horasmensais;
        dados += "\nSalário por Hora: " +this.salariohora;
        return dados;
    }


    // Calcular Salário Mensal
    public double CalculaSalário() {
        double SalárioMensal = salariohora * horasmensais;
        return SalárioMensal;
    }

}
