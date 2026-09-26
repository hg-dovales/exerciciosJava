public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Gabriel", 1000.0);
        contaBancaria.depositar(500.0);
        contaBancaria.sacar(200.0);
        contaBancaria.depositar(-50.0);
        contaBancaria.sacar(2000.0);
        System.out.println(contaBancaria.getTitular() + ": " + contaBancaria.getSaldo());
    }
}
