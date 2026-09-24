public class ContaBancaria {
    private String titular;
    private double saldoInicial;
    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldoInicial = saldoInicial;
        if(this.saldoInicial < 0.0){
                System.out.println("Saldo inicial inválido.");
                this.saldoInicial = 0.0;
            }
    }
    String getTitular(){
        return titular;
    }
    double getSaldoInicial(){
        return saldoInicial;
    }
}
