package exercicio116;

public class ParkingLot {
    private String name;
    private double hourlyRate;
    private int availableSpots;
    public ParkingLot(String name, double hourlyRate, int availableSpots){
        this.name = name;
        if(hourlyRate <= 0.0){
            System.out.println("Valor por hora invalido.");
            this.hourlyRate = 0.0;
        } else{
            this.hourlyRate = hourlyRate;
        }
        if(availableSpots < 0){
            System.out.println("Quantidade de vagas invalidas.");
            this.availableSpots = 0;
        } else{
            this.availableSpots = availableSpots;
        }
    }
    String getName(){
        return name;
    }
    double getHourlyRate(){
        return hourlyRate;
    }
    int getAvailableSpots(){
        return availableSpots;
    }
    boolean occupySpot(){
        if(this.availableSpots < 1){
            return false;
        } else{
            this.availableSpots -= 1;
            return true;
        }
    }
}
