import java.util.ArrayList;

public class ListaProdutosArrayList {
    public static void main(String[] args){
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }
}