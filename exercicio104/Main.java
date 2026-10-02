public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 200.0);
        System.out.println("Preço com desconto: " + produto.calcularPrecoComDesconto(10));
        System.out.println("Preço original: " + produto.getPreco());
    }
}
