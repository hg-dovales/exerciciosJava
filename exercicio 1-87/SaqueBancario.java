import java.util.Scanner;

public class SaqueBancario {
    private static final double SALDO_DISPONIVEL = 1000.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saque = lerSaque(scanner);
        double saldoAtual = calcularSaldo(saque);
        exibirRelatorio(saque, saldoAtual);
        scanner.close();
    }
    public static double lerSaque(Scanner scanner){
        double saque;
        while(true){
            try{
            System.out.print("Digite o valor do saque: ");
            String entrada = scanner.nextLine().trim();
            saque = Double.parseDouble(entrada);
            // O saque não pode ser zero ou negativo.
            if(saque <= 0){
                System.out.println("Valor do saque inválido.");
                continue;
            } else if(saque > SALDO_DISPONIVEL){
                System.out.println("Saldo insuficiente.");
                continue;
            }
            return saque;
            } catch(NumberFormatException erro){
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static double calcularSaldo(double saque){
        double saldoAtual = SALDO_DISPONIVEL - saque;
        return saldoAtual;
    }
    public static void exibirRelatorio(double saque, double saldoAtual){
        System.err.println("Saque realizado: " + saque);
        System.err.println("Saldo restante: " + saldoAtual);
    }
}
