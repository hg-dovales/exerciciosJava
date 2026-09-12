public class TresMetodosDiferentes {
    public static void main(String[] args){
        String nome = "Gabriel";
        double precoProduto = 1200.0;
        double desconto = 0.15;
        double descontoProduto = calcularDesconto(precoProduto, desconto);
        double precoFinal = calcularPrecoFinal(precoProduto, descontoProduto);
        exibirCompra(nome, descontoProduto, precoFinal);
    }
    public static double calcularDesconto(double precoProduto, double desconto){
        double descontoProduto = precoProduto * desconto;
        return descontoProduto;
    }
     public static double calcularPrecoFinal(double precoProduto, double descontoProduto){
        double precoFinal = precoProduto - descontoProduto;
        return precoFinal;
    }
    public static void  exibirCompra(String nome, double descontoProduto, double precoFinal){
        System.out.println("Cliente: " + nome);
        System.out.println("Desconto: " + descontoProduto);
        System.out.println("Preço final: " + precoFinal);
    }
}