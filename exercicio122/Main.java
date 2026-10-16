package exercicio122;

public class Main{
   public static void main(String[] args){
    PetHotel petHotel = new PetHotel("Happy Pets", 50.0, 1);
    PetStay petStay = new PetStay(petHotel, "Thor", 7, true);
    System.out.println("Hotel: " + petHotel.getName());
    System.out.println("Valor: " + petStay.calculateTotal());
    System.out.println("Vagas: " + petHotel.getAvailableSpaces());
    petStay.confirmStay();
    System.out.println("Vagas: " + petHotel.getAvailableSpaces());
    PetStay petStay2 = new PetStay(petHotel, "Luna", 3, false);
    petStay2.confirmStay();
    System.out.println("Vagas: " + petHotel.getAvailableSpaces());
   }
}