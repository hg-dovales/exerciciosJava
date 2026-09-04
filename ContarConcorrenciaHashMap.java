import java.util.HashMap;

public class ContarConcorrenciaHashMap {
    public static void main(String[] args) {
        int[] vendas = {101, 205, 101, 310, 205, 101};
        HashMap<Integer,Integer> produtosVendidos = new HashMap<>();
        for(int codigo : vendas){
            if(produtosVendidos.containsKey(codigo)){
                int ajuste = produtosVendidos.get(codigo) + 1;
                produtosVendidos.put(codigo, ajuste);
            } else{
                produtosVendidos.put(codigo, 1);
            }
        }
        for(int codigo : produtosVendidos.keySet()){
            System.out.println(codigo + " - " + produtosVendidos.get(codigo));
        }
    }
}
