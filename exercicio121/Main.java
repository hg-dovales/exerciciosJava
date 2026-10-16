package exercicio121;

public class Main{
  public static void main(String[] args){
    BikeStation bikeStation = new BikeStation("City Bikes", 20.0, 1);
    BikeRental bikeRental = new BikeRental(bikeStation, "Gabriel", 5);
    System.out.println("Estação: " + bikeStation.getName());
    System.out.println("Valor: " + bikeRental.calculateTotal());
    System.out.println("Bicicletas: " + bikeStation.getAvailableBikes());
    bikeRental.confirmRental();
    System.out.println("Bicicletas: " + bikeStation.getAvailableBikes());
    BikeRental bikeRental2 = new BikeRental(bikeStation, "Raquel", 2);
    bikeRental2.confirmRental();
    System.out.println("Bicicletas: " + bikeStation.getAvailableBikes());
  }
}
