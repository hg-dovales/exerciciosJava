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
    void transferir(double valorTransferido, ContaBancaria contaDestino){
        if(valorTransferido <= 0.0){
            System.out.println("Valor de transferência inválido.");
        }else if(valorTransferido > this.saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            this.saldo -= valorTransferido;
            contaDestino.adicionarSaldo(valorTransferido);
        }
    }
    void adicionarSaldo(double valorTransferido){
        this.saldo += valorTransferido;
    }
}
