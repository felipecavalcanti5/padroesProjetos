package av1.questao02.produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(7, "Produto A", 25.50, 75);

        produto1.adicionarAoEstoque(100);
        produto1.vender(37);

        System.out.println("Valor total em estoque de " + produto1.getNome() + ": R$" + produto1.getValorTotalEmEstoque());
    }
}
