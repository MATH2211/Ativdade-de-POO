package EstoqueProduto.java;

public class Main {

    public static void main(String[] args) {
        // Criação de um produto no estoque com o construtor
        EstoqueProduto produto = new EstoqueProduto("Produtos ilegais", 100, 2900.9999);

        // Chama o método para cadastrar o produto
        produto.cadastrarProduto("notebook", 15, 2500.00);

        // Exibe as informações do estoque
        produto.exibirEstoque();
    }
}
