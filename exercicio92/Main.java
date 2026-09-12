public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira Gamer", 1200.0, 20);
        produto.adicionarQuantidadeEstoque(5);
        produto.retirarQuantidadeEstoque(8);
        produto.exibirDados();
    }
}
