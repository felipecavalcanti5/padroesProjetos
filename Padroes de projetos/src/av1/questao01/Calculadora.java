package av1.questao01;

public class Calculadora {
    private int valorA;
    private int valorB;

    //Obs01.: Subtituí o acesso das variáveis de público para privado na ordem de dotar o código de maior segurança (encapsulamento);

    //Obs02.: Tornei o nome das variáveis mais descritivas para melhor entendimento do código por terceiros;

    public Calculadora(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public int somar(){
        return valorA + valorB;
    }

    //Obs03.: Para manter uma padronização, escrevi os métodos por extenso, tornando-os mais claros;

    public int subtrair(){
        return valorA - valorB;
    }

    public int multiplicar(){
        return valorA * valorB;
    }

    public int dividir() throws ArithmeticException {
        if (valorB == 0) {
            throw new ArithmeticException("Erro: Divisão por zero");
        }
        return valorA / valorB;

        //Obs04.: Em 'dividir', eliminei a necessidade de imprimir no terminal uma mensagem de erro utilizando uma exceção;
    }
}
