public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse Gamer", 180.0, 20);
        produto.adicionarQuantidadeEstoque(5);
        produto.retirarQuantidadeEstoque(7);
        int quantidadeEstoque = produto.retornarQuantidadeEstoque();
        System.out.println("Estoque atual: " + quantidadeEstoque);
    }
}
