public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.0, 4);
        produto.adicionarEstoque(6);
        produto.adicionarEstoque(2);
        produto.exibirDados();
    }
}
