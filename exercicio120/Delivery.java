package exercicio120;

public class Delivery{
  private static final double DELIVERY_RATE_PER_DISTANCE = 2.00;
  private static final double DELIVERY_RATE_EXPRESS = 15.00;
  private DeliveryService deliveryService;
  private String customerName;
  private double distance;
  private boolean isExpress;
  public Delivery(DeliveryService deliveryService, String customerName, double distance, boolean isExpress){
    this.deliveryService = deliveryService;
    this.customerName = customerName;
    this.isExpress = isExpress;
    if(distance <= 0.0){
      System.out.println("Distância inválida.");
      this.distance = 1.0;
    } else{
      this.distance = distance;
    }
  }
  double calculateTotal(){
    if(!isExpress){
      return deliveryService.getBasePrice() + (distance * DELIVERY_RATE_PER_DISTANCE);
    } else{
      return deliveryService.getBasePrice() + (distance * DELIVERY_RATE_PER_DISTANCE) + DELIVERY_RATE_EXPRESS;
    }
  }
  boolean confirmDelivery(){
    if(!deliveryService.acceptDelivery()){
      System.out.println("Não há entregas disponíveis.");
      return false;
    } else{
      return true;
    }
  }
}
