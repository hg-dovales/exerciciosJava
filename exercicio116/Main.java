package exercicio116;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("Central Parking", 15.0, 1);
        Parking parking = new Parking(parkingLot, "ABC1234", 3);
        System.out.println("Estacionamento: " + parkingLot.getName());
        System.out.println("Valor: " + parking.calculateTotal());
        System.out.println("Vagas: " + parkingLot.getAvailableSpots());
        parking.confirmParking();
        System.out.println("Vagas: " + parkingLot.getAvailableSpots());
        Parking parking2 = new Parking(parkingLot, "XYZ9876", 2);
        parking2.confirmParking();
        System.out.println("Vagas: " + parkingLot.getAvailableSpots());
    }
}
