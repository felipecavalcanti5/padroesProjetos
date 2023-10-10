package tech.felipecavalcantiaa.Aula.Heranca.contas;

public class ContaEspecial extends Conta {
    double limite;

    boolean saque(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - (valor * 0.9);
            return true;
        }else{
            return false;
        }
    }

    //"na herança, eu tenho tudo do anterior, porém é possível sobrepor"

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
}
