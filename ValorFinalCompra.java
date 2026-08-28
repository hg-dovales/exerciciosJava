public class ValorFinalCompra {
    public static void main(String[] args){
        double precoProduto = 800.0;
        int quantidade = 3;
        double taxaEntrega = 50.0;
        double valorCompra = calcularSubTotal(precoProduto, quantidade);
        double taxaServico = calcularTaxaServico(valorCompra);
        double valorTotal = calcularTotal(valorCompra, taxaServico, taxaEntrega);
        System.out.println("Preço do produto: "+ precoProduto);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Subtotal: "+ valorCompra);
        System.out.println("Taxa de serviço: "+ taxaServico);
        System.out.println("Taxa de entrega: "+ taxaEntrega);
        System.out.println("Total: "+ valorTotal);
    }
    public static double calcularSubTotal(double precoProduto, int quantidade){
        double valorCompra = precoProduto * quantidade;
        return valorCompra;
    }
    public static double calcularTaxaServico(double valorCompra){
        double taxaServico = valorCompra * 0.05 ;
        return taxaServico;
    }
    public static double calcularTotal(double valorCompra, double taxaServico, double taxaEntrega){
        double valorTotal = valorCompra + taxaServico + taxaEntrega;
        return valorTotal;
    }
}