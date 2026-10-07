public class ContaEnergia {
    private String cliente;
    private double consumoKwh;
    private double valorPorKwh;
    public ContaEnergia(String nomeCliente, double consumoKwh, double valorPorKwh){
        this.cliente = nomeCliente;
        if(consumoKwh < 0.0){
            System.out.println("Consumo invalido.");
            this.consumoKwh = 0.0;
        } else{
            this.consumoKwh = consumoKwh;
        }
        if(valorPorKwh <= 0.0){
            System.out.println("Valor por kWh invalido.");
            this.valorPorKwh = 0.0;
        } else{
            this.valorPorKwh = valorPorKwh;
        }
    }
    String getNomeCliente(){
        return cliente;
    }
    double getConsumoKwh(){
        return consumoKwh;
    }
    double getValorPorKwh(){
        return valorPorKwh;
    }
    double calcularValorConta(){
        double valorConta = this.consumoKwh * this.valorPorKwh;
        return valorConta;
    }
    void adicionarConsumo(double consumoAdicional){
        if(consumoAdicional > 0.0){
            this.consumoKwh += consumoAdicional;
        } else{
            System.out.println("Consumo adicional invalido.");
        }
    }
}
