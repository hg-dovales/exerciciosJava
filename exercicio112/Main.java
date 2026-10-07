public class Main{
    public static void main(String[] args) {
        Room room = new Room(101, 250.0);
        Reservation reservation = new Reservation(room, "Gabriel", 3);
        System.out.println("Quarto: " + room.getNumber());
        System.out.println("Total: " + reservation.calculateTotal());
        reservation.confirmReservation();
        System.out.println("Disponível: " + room.getAvailable());
        Reservation reservation2 = new Reservation(room, "Raquel", 2);
        reservation2.confirmReservation();
    }
}