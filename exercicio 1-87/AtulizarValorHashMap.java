import java.util.HashMap;

public class AtulizarValorHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> estoqueProduto = new HashMap<>();
        estoqueProduto.put(101, 20);
        estoqueProduto.put(205, 15);
        estoqueProduto.put(310, 30);
        int ajuste = estoqueProduto.get(205) + 10;
        estoqueProduto.put(205, ajuste);
        System.out.println("Estoque do produto 205: " + estoqueProduto.get(205));
    }
}
