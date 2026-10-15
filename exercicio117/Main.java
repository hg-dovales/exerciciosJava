package exercicio117;

public class Main {
    public static void main(String[] args) {
        Hotel hotel  = new Hotel("Sun Hotel", 200.0, 1);
        Stay stay = new Stay(hotel, "Gabriel", 3, true);
        System.out.println("Hotel: " + hotel.getName());
        System.out.println("Valor: " + stay.calculateTotal());
        System.out.println("Quartos: " + hotel.getAvailableRooms());
        stay.confirmStay();
        System.out.println("Quartos: " + hotel.getAvailableRooms());
        Stay stay2 = new Stay(hotel, "Raquel", 2, false);
        stay2.confirmStay();
        System.out.println("Quartos: " + hotel.getAvailableRooms());
    }
}
