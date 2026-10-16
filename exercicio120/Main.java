package exercicio120;

public class Main {
  public static void main(String[] args){
    DeliveryService deliveryService = new DeliveryService("Fast Delivery", 10.0, 1);
    Delivery delivery = new Delivery(deliveryService, "Gabriel", 5.0, true);
    System.out.println("Serviço: " + deliveryService.getName());
    System.out.println("Valor: " + delivery.calculateTotal());
    System.out.println("Entregas disponíveis: " + deliveryService.getAvailableDeliveries());
    delivery.confirmDelivery();
    System.out.println("Entregas disponíveis: " + deliveryService.getAvailableDeliveries());
    Delivery delivery2 = new Delivery(deliveryService, "Raquel", 3.0, false);
    delivery2.confirmDelivery();
    System.out.println("Entregas disponíveis: " + deliveryService.getAvailableDeliveries());
  }
}
