public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("SSD", 400.0, 5);
        produto.setPreco(350.0);
        produto.setPreco(-50.0);
        System.out.println("Preço atual: " + produto.getPreco());
    }
}
