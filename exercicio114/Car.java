public class Car {
    private String model;
    private double dailyRate;
    private boolean available;
    public Car(String model, double dailyRate){
        this.model = model;
        this.available = true;
        if(dailyRate <= 0.0){
            System.out.println("Valo da dialria invalido");
            this.dailyRate = 0.0;
        } else{
            this.dailyRate = dailyRate; 
        }
    }
    String getModel(){
        return model;
    }
    double getDailyRate(){
        return dailyRate;
    }
    boolean getAvailable(){
        return available;
    }
    boolean rent(){
        if(!this.available){
            return false;
        } else{
            this.available = false;
            return true;
        }
    }
    void returnCar(){
        this.available = true;
    }
}