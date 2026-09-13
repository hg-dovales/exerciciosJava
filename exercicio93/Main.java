public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Headset", 250.0, 10);
        produto.retirarQuantidadeEstoque(4);
        produto.retirarQuantidadeEstoque(8);
        produto.exibirDados();
    }
}