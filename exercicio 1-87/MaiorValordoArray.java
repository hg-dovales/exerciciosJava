public class MaiorValordoArray {
    public static void main(String[] args){
        int[] vendas = {18, 25, 12, 30, 22, 17};
        int maiorVenda = vendas[0];
        int i;
        for(i = 0; i < vendas.length; i++){
            if(vendas[i] > maiorVenda){
                maiorVenda = vendas[i];
            }
        }
        System.out.println("Maior quantidade de vendas: " + maiorVenda);
    }
}