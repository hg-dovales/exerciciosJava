package exercicio94;
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecânico", 350.0, 12);
        produto.adicionarQuantidadeEstoque(3);
        produto.retirarQuantidadeEstoque(5);
        produto.exibirDados();
    }
}
