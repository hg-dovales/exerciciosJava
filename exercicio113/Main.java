public class Main{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Gabriel", 500.0);
        bankAccount.deposit(200.0);
        bankAccount.withdraw(300.0);
        System.out.println("Titular: " + bankAccount.getOwner());
        System.out.println("Saldo: " + bankAccount.getBalance());
        System.out.println("Ativa: " + bankAccount.getActive());
        bankAccount.closeAccount();
        bankAccount.withdraw(400.0);
        bankAccount.closeAccount();
        bankAccount.deposit(100.0);
        System.out.println("Saldo: " + bankAccount.getBalance());
        System.out.println("Ativa: " + bankAccount.getActive());
    }
}