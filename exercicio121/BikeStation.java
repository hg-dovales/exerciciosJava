package exercicio121;

public class BikeStation{
  private String name;
  private double hourlyRate;
  private int availableBikes;
  public BikeStation(String name, double hourlyRate, int availableBikes){
    this.name = name;
    if(hourlyRate <= 0.0){
      System.out.println("Valor por hora invalido");
      this.hourlyRate = 0.0;
    } else{
      this.hourlyRate = hourlyRate;
    }
    if(availableBikes < 0){
      System.out.println("Quantidade de bicicletas invalida.");
      this.availableBikes = 0;
    } else{
      this.availableBikes = availableBikes;
    }
  }
  String getName(){
    return name;
  }
  double getHourlyRate(){
    return hourlyRate;
  }
  int getAvailableBikes(){
    return availableBikes;
  }
  boolean rentBike(){
    if(availableBikes < 1){
      return false;
    } else{
      availableBikes -= 1;
      return true;
    }
  }
}
