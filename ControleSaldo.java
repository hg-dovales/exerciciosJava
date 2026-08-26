public class ControleSaldo{
    public static void main(String[] args){
        int operacao = 1;
        double saldoFinal = 0;
        double saldo = 500.00;
        double saque = 100.0;
        double deposito = 50.00;
        while(operacao <= 5){
            if(operacao % 2 == 0){
                System.out.println("Operação " + operacao + " - Depósito: " + deposito);
                saldo = saldo + deposito;
                System.out.println("Saldo atual: " + saldo);
            } else{
                System.out.println("Operação " + operacao + " - Saque: " + saque);
                saldo = saldo - saque;
                System.out.println("Saldo atual: " + saldo);
            }
            operacao++;
        }
        System.out.println("Saldo final: " + saldo);
    }
}