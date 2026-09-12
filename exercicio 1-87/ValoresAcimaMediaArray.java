public class ValoresAcimaMediaArray {
    public static void main(String[] args) {
        double[] venda = {20, 35, 15, 40, 30, 25, 45};
        int i;
        double totalVendas = 0;
        double mediaVendas;
        int acimaMedia = 0;
        for(i = 0; i < venda.length; i++){
            totalVendas += venda[i];
        }
        mediaVendas = totalVendas / venda.length;
        for(i = 0; i < venda.length; i++){
            if (venda[i] > mediaVendas){
                acimaMedia++;
            }
        }
        System.out.println("Média de vedas: " + mediaVendas);
        System.out.println("Dias acima da média: " + acimaMedia);
    }
}