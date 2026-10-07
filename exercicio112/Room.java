public class Room{
    private int number;
    private double dailyRate;
    private boolean available;
    public Room(int number, double dailyRate){
        this.number = number;
        if(dailyRate <= 0.0){
            System.out.println("Valor da diária inválido.");
            this.dailyRate = 0.0;
        } else{
            this.dailyRate = dailyRate;
        }
        this.available = true;
    }
    int getNumber(){
        return number;
    }
    double getDailyRate(){
        return dailyRate;
    }
    boolean getAvailable(){
        return available;
    }
    boolean reserve(){
        if(!this.available){
            return false;
        } else{
            this.available = false;
            return true;
        }
    }
}