package tech.felipecavalcantiaa.Aula.Heranca.contas;

public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;

    boolean saque(double valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - (valor * 0.99);
            return true;
        }else{
            return false;
        }
        //Diferente de Conta

    }
    boolean deposito(){
        //Diferente de Conta
        return false;
    }
    boolean aplicaRendimento(){
        //Diferente de Conta
        return false;
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }
}
