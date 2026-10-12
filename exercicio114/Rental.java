public class Rental{
    private Car car;
    private String customer;
    private int numberOfDays;
    public Rental(Car car, String customer, int numberOfDays){
        this.car = car;
        this.customer = customer;
        if(numberOfDays <= 0){
            System.out.println("Quantidade de dias invalida.");
            this.numberOfDays = 1;
        } else{
            this.numberOfDays = numberOfDays;
        }
    }
    double calculateTotal(){
        return car.getDailyRate() * this.numberOfDays;
    }
    boolean confirmRental(){
        if(!car.rent()){
            System.out.println("Carro indisponivel.");
            return false;
        } else{
            return true;
        }
    }
}