public class SegundoMaiorArray {
    public static void main(String[] args){
        int[] vendas = {25, 40, 18, 35, 50, 30, 45};
        int maiorVenda = vendas[0];
        int segundaMaiorVenda = vendas[0];
        int i;
        for(i = 0; i < vendas.length; i++){
            if(vendas[i] > maiorVenda){
                maiorVenda = vendas[i];
            }
        }
        for(i = 0; i < vendas.length; i++){
            if(vendas[i] < maiorVenda && vendas[i] > segundaMaiorVenda){
                segundaMaiorVenda = vendas[i];
            }
        }
        System.out.println("Maior valor: " + maiorVenda);
        System.out.println("Segundo maior valor: " + segundaMaiorVenda);
    }
}