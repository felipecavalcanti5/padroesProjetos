package av1.questao02.produto;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public Produto(int id, String nome, double preco, int qtdEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void adicionarAoEstoque(int quantidade) {
        if (quantidade > 0) {
            qtdEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdEmEstoque) {
            qtdEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram vendidas.");
        } else if (qtdEmEstoque == 0) {
            System.out.println(nome + " está fora de estoque.");
        } else {
            System.out.println("Quantidade inválida ou insuficiente em estoque.");
        }
    }

    public double getValorTotalEmEstoque() {
        return preco * qtdEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }
}