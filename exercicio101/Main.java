public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Mouse", 10);
        estoque.removerEstoque(3);
        estoque.removerEstoque(20);
        System.out.println("Produto: " + estoque.getProduto());
        System.out.println("Quantidade: " + estoque.getQuantidade());
    }
}
