package exercicio120;

public class DeliveryService{
  private String name;
  private double basePrice;
  private int availableDeliveries;
  public DeliveryService(String name, double basePrice, int availableDeliveries){
    this.name = name;
    if(basePrice <= 0.0){
      System.out.println("Preco base invalido.");
      this.basePrice = 0.0;
    } else{
      this.basePrice = basePrice;
    }
    if(availableDeliveries < 0){
      System.out.println("Quantidade de entregas invalida.");
      this.availableDeliveries = 0;
    } else{
      this.availableDeliveries = availableDeliveries;
    }
  }
  String getName(){
    return name;
  }
  double getBasePrice(){
    return basePrice;
  }
  int getAvailableDeliveries(){
    return availableDeliveries;
  }
  boolean acceptDelivery(){
    if(availableDeliveries < 1){
      return false;
    } else{
      this.availableDeliveries -= 1;
      return true;
    }
  }
}
