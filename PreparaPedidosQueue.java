import java.util.ArrayDeque;
import java.util.Queue;

public class PreparaPedidosQueue {
    public static void main(String[] args) {
        Queue<Integer> filaPedidos = new ArrayDeque<Integer>();
        filaPedidos.offer(101);
        filaPedidos.offer(102);
        filaPedidos.offer(103);
        filaPedidos.offer(104);
        System.out.println("Próximo pedido: Pedido " + filaPedidos.peek());
        System.out.println("Pedido " + filaPedidos.peek() +" preparado.");
        filaPedidos.poll();
        System.out.println("Próximo pedido: Pedido " + filaPedidos.peek());

    }
}
