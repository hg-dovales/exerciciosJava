package exercicio121;

public class BikeRental{
  private static final int LIMIT_FOR_DISCOUNT = 5;
  private static final double DISCOUNTED_PRICE_RATE = 0.80;
  private BikeStation bikeStation;
  private String customerName;
  private int numberOfHours;
  public BikeRental(BikeStation bikeStation, String customerName, int numberOfHours){
    this.bikeStation = bikeStation;
    this.customerName = customerName;
    if(numberOfHours <= 0){
      System.out.println("Quantidade de horas inválida.");
      this.numberOfHours = 1;
    } else{
      this.numberOfHours = numberOfHours;
    }
  }
  double calculateTotal(){
    if(numberOfHours < LIMIT_FOR_DISCOUNT){
      return numberOfHours * bikeStation.getHourlyRate();
    } else{
      return numberOfHours * bikeStation.getHourlyRate() * DISCOUNTED_PRICE_RATE;
    }
  }
  boolean confirmRental(){
    if(!bikeStation.rentBike()){
      System.out.println("Não há bicicletas disponíveis.");
      return false;
    } else{
      return true;
    }
  }
}
