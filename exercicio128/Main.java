package exercicio128;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Mechanical Keyboard", 10);
        product.sell(3);
        System.out.println("Quantidade em estoque: " + product.getQuantity());
        product.restock(5);
        System.out.println("Quantidade em estoque: " + product.getQuantity());
        product.sell(10);
        System.out.println("Quantidade em estoque: " + product.getQuantity());
        product.sell(4);
        System.out.println("Quantidade em estoque: " + product.getQuantity());
    }
}
