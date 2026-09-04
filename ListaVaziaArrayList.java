import java.util.ArrayList;

public class ListaVaziaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> pedido = new ArrayList<>();
        pedido.add(101);
        pedido.add(102);
        pedido.add(103);
        pedido.clear();
        if(pedido.isEmpty()){
            System.out.println("Não existem pedidos pendentes.");
        }
    }
}
