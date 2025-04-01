package EstoqueProduto.java;

public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;

    // Construtor para inicializar os atributos
    public EstoqueProduto(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Métodos getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para cadastrar o produto
    public void cadastrarProduto(String descricao, int quantidade, double valor) {
        this.descricao = descricao.toUpperCase();
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Método para remover a quantidade de um produto
    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidade(s) removida(s) do estoque.");
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }

    // Método para exibir as informações do estoque
    public void exibirEstoque() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: R$ " + valor);
    }
}
