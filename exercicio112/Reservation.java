public class Reservation{
    private Room room;
    private String guest;
    private int numberOfDays;
    public Reservation(Room room, String guest, int numberOfDays){
        this.room = room;
        this.guest = guest;
        if(numberOfDays <= 0){
            System.out.println("Quantidade de dias invalido.");
            this.numberOfDays = 1;
        } else{
            this.numberOfDays = numberOfDays;
        }
    }
    double calculateTotal(){
        return room.getDailyRate() * this.numberOfDays;
    }
    boolean confirmReservation(){
        if(!room.reserve()){
            System.out.println("Quarto indisponivel");
            return false;
        } else{
            return true;
        }
    }
}