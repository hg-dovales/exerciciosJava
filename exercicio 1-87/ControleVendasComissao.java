public class ControleVendasComissao {
    public static void main(String[] args){
        int vendedor = 1;
        double valorVenda;
        double comissao;
        double faturamentoTotal = 0;
        double comissaoTotal = 0;
        while(vendedor <= 6){
            valorVenda = vendedor * 200;
            faturamentoTotal = faturamentoTotal + valorVenda;
            if(valorVenda > 0 && valorVenda < 600){
                comissao = 50;
                System.out.println("Vendedor " + vendedor + " - Venda: " + valorVenda + " - Comissão: " + comissao);
                comissaoTotal = comissaoTotal + comissao;
            } else if(valorVenda >= 600 && valorVenda <=999){
                comissao = 100;
                System.out.println("Vendedor " + vendedor + " - Venda: " + valorVenda + " - Comissão: " + comissao);
                comissaoTotal = comissaoTotal + comissao;
            } else if(valorVenda >= 1000){
                comissao = 150;
                System.out.println("Vendedor " + vendedor + " - Venda: " + valorVenda + " - Comissão: " + comissao);
                comissaoTotal = comissaoTotal + comissao;
            }
            vendedor++;
        }
        System.out.println("Faturamento Total: " + faturamentoTotal);
        System.out.println("Total de comissões: " + comissaoTotal);
    }
}