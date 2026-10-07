public class Main {
    public static void main(String[] args) {
        ContaEnergia contaEnergia = new ContaEnergia("Gabriel", 150.0, 0.80);
        System.out.println("Cliente: " + contaEnergia.getNomeCliente());
        System.out.println("Consumo: " + contaEnergia.getConsumoKwh());
        System.out.println("Valor da conta: " + contaEnergia.calcularValorConta());
        contaEnergia.adicionarConsumo(50.0);
        System.out.println("Novo consumo: " + contaEnergia.getConsumoKwh());
        System.out.println("Novo valor da conta: " + contaEnergia.calcularValorConta());
        contaEnergia.adicionarConsumo(-20.0);
    }
}
