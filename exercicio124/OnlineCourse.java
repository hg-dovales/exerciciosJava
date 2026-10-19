package exercicio124;

public class OnlineCourse {
    private String name;
    private double basePrice;
    private int availableSpots;
    public OnlineCourse(
        String name, 
        double basePrice, 
        int availableSpots){
        this.name = name;
        if(basePrice <= 0.0){
            System.out.println("Preco invalido.");
            this.basePrice = 0.0;
        } else{
            this.basePrice = basePrice;
        }
        if(availableSpots < 0){
            System.out.println("Quantidade de vagas invalida.");
            this.availableSpots = 0;
        } else{
            this.availableSpots = availableSpots;
        }
    }
    String getName(){
        return name;
    }   
    double getBasePrice(){
        return basePrice;
    }
    int getAvailableSpots(){
        return availableSpots;
    }
    boolean enrollStudent(){
        if(availableSpots < 1){
            return false;
        } else{
            availableSpots -= 1;
            return true;
        }
    }
}
