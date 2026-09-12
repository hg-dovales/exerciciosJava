package exercicio96;
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Webcam", 320.0, 7);
        String nome = produto.getNome();
        double preco = produto.getPreco();
        int quantidadeEstoque = produto.getQuantidadeEstoque();
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}
