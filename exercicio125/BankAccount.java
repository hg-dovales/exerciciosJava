package exercicio125;

public class BankAccount {
    private String ownerName;
    private double balance;
    private double overdraftLimit;
    public BankAccount(String ownerName, double balance, double overdraftLimit){
        this.ownerName = ownerName;
        if(balance < 0){
            System.out.println("Saldo inicial invalido.");
            this.balance = 0.0;
        } else{
            this.balance = balance;
        }
        if(overdraftLimit < 0){
            System.out.println("Limite invalido.");
            this.overdraftLimit = 0.0;
        } else{
            this.overdraftLimit = overdraftLimit;
        }
    }
    String getOwnerName(){
        return ownerName;
    }
    double getBalance(){
        return balance;
    }
    double getOverdraftLimit(){
        return overdraftLimit;
    }
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Valor de deposito invalido.");
        } else{
            balance += amount;
        }
    }
    boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Valor de saque invalido.");
            return false;
        }
        if(amount > balance + overdraftLimit){
            System.out.println("Saldo e limite insuficientes.");
            return false;
        }
        balance -= amount;
        return true;
    }
}
