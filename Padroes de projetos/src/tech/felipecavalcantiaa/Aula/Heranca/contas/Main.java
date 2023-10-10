package tech.felipecavalcantiaa.Aula.Heranca.contas;

public class Main {
    public static void main(String[] args) {
        ContaEspecial specialAccount = new ContaEspecial(1,10000,100000);
        specialAccount.saque(100);

        System.out.println(specialAccount.saldo);
    }
}
