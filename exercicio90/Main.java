public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Monitor", 900.0, 5);
        produto.adicionarEstoque(3);
        produto.exibirDados();
    }
}
