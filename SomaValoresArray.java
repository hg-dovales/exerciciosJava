public class SomaValoresArray {
    public static void main(String[] args){
        int[] produtosVendidos = {12, 8, 15, 10, 5};
        int totalVendidos = 0;
        int i;
        for(i = 0; i < produtosVendidos.length; i++){
            totalVendidos += produtosVendidos[i];
        }
        System.out.println("Total de produtos vendidos: " + totalVendidos);
    }
}