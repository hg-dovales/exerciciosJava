import java.util.HashMap;

public class LocalizarElementoHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> codigoProduto = new HashMap<>();
        codigoProduto.put(101, "Arroz");
        codigoProduto.put(205, "Feijão");
        codigoProduto.put(310, "Macarrão");
        codigoProduto.put(415, "Café");
        System.out.println("Produto encontrado: " + codigoProduto.get(310));
    }
}
