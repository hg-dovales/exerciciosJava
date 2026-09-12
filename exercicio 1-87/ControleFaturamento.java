public class ControleFaturamento {
    public static void main(String[] args){
        int vendedor;
        double valorVenda;
        double faturamentoTotal = 0;
        int quantidadesVendasAltas = 0;
        for(vendedor = 1; vendedor <= 6; vendedor++){
            valorVenda = vendedor * 100;
            faturamentoTotal = faturamentoTotal + valorVenda;
            if(valorVenda >= 400){
                System.out.println("Vendedor " + vendedor + " - Venda: " + valorVenda + " - Venda Alta");
                quantidadesVendasAltas++;
            } else{
                System.out.println("Vendedor " + vendedor + " - Venda: " + valorVenda + " - Venda Baixa");
            }
        }
        System.out.println("Faturamento Total: " + faturamentoTotal);
        System.out.println("Quantidade de vendas altas: " + quantidadesVendasAltas);
    }
}