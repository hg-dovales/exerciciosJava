package exercicio102;

public class Main {
    public static void main(String[] args) {
        ContaBancaria gabriel = new ContaBancaria("Gabriel", 1000.0);
        ContaBancaria raquel = new ContaBancaria("Raquel", 500.0);
        gabriel.transferir(300, raquel);
        gabriel.transferir(1000.0, raquel);
        System.out.println(gabriel.getTitular() + ": " + gabriel.getSaldo());
        System.out.println(raquel.getTitular() + ": " + raquel.getSaldo());
    }
}
