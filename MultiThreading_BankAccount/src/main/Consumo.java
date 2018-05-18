package main;

public class Consumo extends Thread {

    Conta saldo;

    public Consumo(Conta saldo) {
        this.saldo = saldo;
    }

    @Override
    public void run() {
        while (saldo.ImprimeSaldo() >= 0) {
            synchronized (saldo) {
                int saldoantido = saldo.ImprimeSaldo();
                int transacao = (int) (Math.random() * 100 + 1);
                saldo.DeduzSaldo(transacao);
                System.out.println(this.getName() + " chanched saldo from " + saldoantido + " to " + saldo.ImprimeSaldo() + " by " + transacao);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
