public class ValorFinalServico {
    public static void main(String[] args){
        double valorServico = 2000.0;
        double taxaAdicional = 300.0;
        double valorFinal = calcularValorBruto(valorServico, taxaAdicional);
        exibirResultado(valorFinal);
    }
    public static double calcularValorBruto(double valorServico, double taxaAdicional){
        double valorBruto = valorServico + taxaAdicional;
        double valorFinal = valorBruto - calcularImposto(valorBruto);
        return valorFinal;
    }
    public static double calcularImposto(double valorBruto){
        double imposto = valorBruto * 0.1;
        return imposto;
    }
    public static void exibirResultado(double valorFinal){
        System.out.println("Valor final: " + valorFinal);
    }
}