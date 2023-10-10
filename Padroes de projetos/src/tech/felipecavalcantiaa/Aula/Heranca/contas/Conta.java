package tech.felipecavalcantiaa.Aula.Heranca.contas;

public class Conta {
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean saque(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}
