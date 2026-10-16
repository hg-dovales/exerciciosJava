package exercicio122;

public class PetHotel{
    private String name;
    private double dailyRate;
    private int availableSpaces;
    public PetHotel(String name, double dailyRate, int availableSpaces){
        this.name = name;
        if(dailyRate <= 0.0){
            System.out.println("Diaria invalida.");
            this.dailyRate = 0.0;
        } else{
            this.dailyRate = dailyRate;
        }
        if(availableSpaces < 0){
            System.out.println("Quantidade de vagas invalida.");
            this.availableSpaces = 0;
        } else{
            this.availableSpaces = availableSpaces;
        }
    }
    String getName(){
        return name;
    }
    double getDailyRate(){
        return dailyRate;
    }
    int getAvailableSpaces(){
        return availableSpaces;
    }
    boolean reserveSpace(){
        if(availableSpaces < 1){
            return false;
        } else{
            availableSpaces -= 1;
            return true;
        }
    }
}
