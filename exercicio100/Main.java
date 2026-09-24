public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Mouse", 10);
        estoque.adicionarEstoque(5);
        estoque.adicionarEstoque(-3);
        System.out.println("Produto: " + estoque.getProduto());
        System.out.println("Quantidade: " + estoque.getQuantidade());
    }
}
