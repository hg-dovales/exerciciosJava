package exercicio125;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Gabriel", 500.0, 300.0);
        System.out.println("Conta de " + bankAccount.getOwnerName());
        System.out.println("Saldo inicial: " + bankAccount.getBalance());
        System.out.println("Limite: " + bankAccount.getOverdraftLimit());
        bankAccount.deposit(200.0);
        System.out.println("Saldo: " + bankAccount.getBalance());
        System.out.println("Saque de 800.0: " + bankAccount.withdraw(800.0));
        System.out.println("Saldo: " + bankAccount.getBalance());
        System.out.println("Saque de 250.0: " + bankAccount.withdraw(250.0));
        System.out.println("Saldo: " + bankAccount.getBalance());
    }   
}
