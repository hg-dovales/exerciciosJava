public class DoisMetodos {
    public static void main(String[] args){
        double precoProduto = 500.0;
        double desconto = 0.1;
        double descontoProduto = calcularDesconto(precoProduto, desconto);
        double precoFinal = calcularPrecoFinal(precoProduto, descontoProduto);
        System.out.println("Preço original: " + precoProduto);
        System.out.println("Desconto: " + descontoProduto);
        System.out.println("Preço final: " + precoFinal);
    }
    public static double calcularDesconto(double precoProduto, double desconto){
        double resultado = precoProduto * desconto;
        return resultado;
    }
    public static double calcularPrecoFinal(double precoProduto, double descontoProduto){
        double resultado = precoProduto - descontoProduto;
        return resultado;
    }
}