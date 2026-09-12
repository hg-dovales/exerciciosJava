import java.util.Scanner;

public class CompraComLimiteCartao {
    private static final double LIMITE_DISPONIVEL = 2500.0;
    private static final double LIMITE_BAIXO = 500.0;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double valorCompra = lerValorCompra(scanner);
    double limiteRestante = calcularLimiteRestante(valorCompra);
    exibirRelatorio(valorCompra, limiteRestante);
    scanner.close();
    }
    public static double lerValorCompra(Scanner scanner){
        double valorCompra;
        while(true){
            try{
                System.out.print("Digite o valor da compra: ");
                String entrada = scanner.nextLine().trim();
                valorCompra = Double.parseDouble(entrada);
                // O valor da compra não pode ser negativo.
                if(valorCompra <= 0){
                    System.out.println("Valor da compra inválido");
                    continue;
                } else if(valorCompra > LIMITE_DISPONIVEL){
                    System.out.println("Limite insuficiente.");
                    continue;
                }
                return valorCompra;
            } catch(NumberFormatException erro){
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static double calcularLimiteRestante(double valorCompra){
        double limiteRestante = LIMITE_DISPONIVEL - valorCompra;
        return limiteRestante;
    }
    public static void exibirRelatorio(double valorCompra, double limiteRestante){
        System.out.println("Compra realizada: " + valorCompra);
        System.out.println("Limite restante: " + limiteRestante);
        if(limiteRestante < LIMITE_BAIXO){
            System.out.println("Atenção: limite baixo.");
        }
    }
}
