package exercicio119;

public class Gym {
    private String name;
    private double monthlyFee;
    private int availableSpots;
    public Gym(String name, double monthlyFee, int availableSpots){
        this.name = name;
        if(monthlyFee <= 0.0){
            System.out.println("Mensalidade invalida.");
            this.monthlyFee = 0.0;
        } else {
            this.monthlyFee = monthlyFee;
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
    double getMonthlyFee(){
        return monthlyFee;
    }
    int getAvailableSpots(){
        return availableSpots;
    }
    boolean registerMember(){
        if(availableSpots < 1){
            return false;
        } else{
            availableSpots -= 1;
            return true;
        }
    }
}
