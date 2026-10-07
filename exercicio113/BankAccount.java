public class BankAccount{
    private String owner;
    private double balance;
    private boolean active;
    public BankAccount(String owner, double initialBalance){
        this.owner = owner;
        if(initialBalance< 0.0){
            System.out.println("Saldo inicial invalido.");
            this.balance = 0.0;
        } else{
            this.balance = initialBalance;
        }
        this.active = true;
    }
    String getOwner(){
        return owner;
    }
    double getBalance(){
        return balance;
    }
    boolean getActive(){
        return active;
    }
    void deposit(double amount){
        if(!this.active){
            System.out.println("Conta inativa.");
        } else if(amount <= 0.0){
            System.out.println("Valor de deposito invalido.");
        } else{
            this.balance += amount;
        }
    }
    boolean withdraw(double amount){
        if(!this.active){
            System.out.println("Conta inativa.");
            return false;
        } else if(amount <= 0.0){
            System.out.println("Valor de saque invalido.");
            return false;
        } else if(amount > this.balance){
            System.out.println("Saldo insuficiente.");
            return false;
        } else{
            this.balance -= amount;
            return true;
        }
    }
    boolean closeAccount(){
        if(this.balance > 0.0){
            System.out.println("Nao e possivel encerrar um conta com saldo.");
            return false;
        } else{
            this.active = false;
            return true;
        }
    }
}