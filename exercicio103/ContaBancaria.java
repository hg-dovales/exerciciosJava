public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titularInicial, double saldoInicial){
        this.titular = titularInicial;
        if(saldoInicial >= 0.0){
            this.saldo = saldoInicial;
        }else{
            System.out.println("Saldo inicial inválido.");
            this.saldo = 0.0;
        }
    }
    String getTitular(){
        return titular;
    }
    double getSaldo(){
        return saldo;
    }
    void depositar(double valorDeposito){
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
        } else{
            System.out.println("Valor de depósito inválido.");
        }
    }
    void sacar(double valorSaque){
        if(valorSaque <= 0.0){
            System.out.println("Valor de saque inválido.");
        }else if(valorSaque > this.saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            this.saldo -= valorSaque;
        }
    }
}
