package exercicio128;

public class Product {
    private String name;
    private int quantity;
    public Product(String name, int quantity){
        this.name = name;
        if(quantity < 0){
            System.out.println("Quantidade inicial inválida.");
            this.quantity = 0;
        } else{
            this.quantity = quantity;
        }
    }
    String getName(){
        return name;
    }
    int getQuantity(){
        return quantity;
    }
    void restock(int amount){
        if(amount <= 0){
            System.out.println("Quantidade invalida.");
        } else{
            quantity += amount;
        }
    }
    boolean sell(int amount){
        if(amount <= 0){
            System.out.println("Quantidade invalida.");
            return false;
        }
        if(amount > quantity){
            System.out.println("Quantidade insuficiente.");
            return false;
        }
        quantity -= amount;
        return true;
    }
}
