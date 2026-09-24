public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Gabriel", -500.0);
        System.out.println("Titular: " + contaBancaria.getTitular());
        System.out.println("Saldo: " + contaBancaria.getSaldoInicial());
    }
}