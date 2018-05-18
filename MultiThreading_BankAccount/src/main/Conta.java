package main;

public class Conta {
    
    public int saldo;
    
    Conta (int saldo) {
        this.saldo = saldo;
    }
    
    public void DeduzSaldo(int valor) {
        saldo -= valor;
    }
    
    public int ImprimeSaldo() {
        return this.saldo;
    }
    
}
