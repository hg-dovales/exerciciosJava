package exercicio117;

public class Hotel {
    private String name;
    private double dailyRate;
    private int availableRooms;
    public Hotel(String name, double dailyRate, int availableRooms){
        this.name = name;
        if(dailyRate <= 0.0){
            System.out.println("Valor da diaria invalido.");
            this.dailyRate = 0.0;
        } else{
            this.dailyRate = dailyRate;
        }
        if(availableRooms < 0){
            System.out.println("Quantidade de quartos invalida.");
            this.availableRooms = 0;
        } else{
            this.availableRooms = availableRooms;
        }
    }
    String getName(){
        return name;
    }
    double getDailyRate(){
        return dailyRate;
    }
    int getAvailableRooms(){
        return availableRooms;
    }
    boolean bookRoom(){
        if(availableRooms < 1){
            return false;
        } else{
            this.availableRooms -= 1;
            return true;
        }
    }
}
