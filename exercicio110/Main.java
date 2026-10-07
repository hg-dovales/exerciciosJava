public class Main {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 200.0, 10);
        Pedido pedido = new Pedido(teclado, 3);
        System.out.println("Produto: " + teclado.getNome());
        System.out.println("Total: " + pedido.calcularTotal());
        pedido.finalizarPedido();
        System.out.println("Estoque restante: " + teclado.getEstoque());
    }
}
