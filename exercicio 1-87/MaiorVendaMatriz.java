public class MaiorVendaMatriz {
    public static void main(String[] args) {
        int[][] vendaSemanas = {
            {1200,  1500,  1100,  1800},
            {900,   1700,  2000,  1600},
            {1400,  1300,  1900,  2100}
        };
        int linha = 0;
        int coluna = 0;
        int maiorVenda = vendaSemanas[0][0];
        int vendedor = 1;
        int semana = 1;
        for(linha = 0; linha < vendaSemanas.length; linha++){
            for(coluna = 0; coluna < vendaSemanas[linha].length; coluna++){
                if(vendaSemanas[linha][coluna] > maiorVenda){
                    maiorVenda = vendaSemanas[linha][coluna];
                    semana = coluna + 1;
                    vendedor = linha + 1;
                }
            }
        }
        System.out.println("Maior venda: " + maiorVenda);
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Semana: " + semana);
    }
}
