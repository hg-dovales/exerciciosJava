public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 150.0);
        produto.setPreco(200.0);
        produto.setPreco(-50.0);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}
