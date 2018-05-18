package Teste_03;

public class Exercicio_03_Lampada {

    // Atributos (Propriedades, Dados, Variáveis de Estado, esc.)
    private String cor;
    private int nivellum;
    private int potencia;
    private boolean estado;

    // Métodos (Construtores, Get/Set, Outros)
    public Exercicio_03_Lampada(String cor, int nivellum, int potencia, boolean estado) {
        this.cor = cor;
        this.nivellum = nivellum;
        this.potencia = potencia;
        this.estado = estado;
    }

    public Exercicio_03_Lampada() {
        this.cor = "Branca";
        this.nivellum = 50;
        this.potencia = 60;
        this.estado = false;
    }

    private String set_cor(String cor) {
        return this.cor = cor;
    }

    public String get_cor() {
        return this.cor;
    }

    private int set_nivellum (int nivellum) {
        return this.nivellum = nivellum;
    }

    public int  get_nivellum() {
        return this.nivellum;
    }

    private int set_potencia (int potencia) {
        return this.potencia = potencia;
    }

    public int  get_potencia() {
        return this.potencia;
    }

    private boolean set_estado (boolean estado) {
        return this.estado = estado;
    }

    public boolean  get_estado() {
        return this.estado;
    }

    // Mostrar Estado
    public String MostrarEstado() {
        String Estado = "";
        if (this.estado == false)
            Estado = "A lâmpada está Apagada";
        else
            Estado = "A lâmpada está Acesa";
        return Estado;
    }

    // Mostrar Dados
    public String MostrarDados() {
        String dados = "";
        dados += "\nCor da Lâmpada: " +this.cor;
        dados += "\nNível de Luminusidade: " +this.nivellum +"%";
        dados += "\nPotencia: " +this.potencia +"Wt";
        dados += "\nEstado da Lâmpada: " +MostrarEstado();
        return dados;
    }

    // Alterar estado
    public void AlterarEstado() {
        boolean Estado = this.estado;
        Estado = !Estado;
        set_estado(Estado);
    }

    public void AlterarLuminusidadeUp() {
        int nivellum = this.nivellum;
        nivellum = nivellum + 5;
        set_nivellum(nivellum);
    }

    public void AlterarLuminusidadeDown() {
        int nivellum = this.nivellum;
        nivellum = nivellum - 5;
        set_nivellum(nivellum);
    }

}
