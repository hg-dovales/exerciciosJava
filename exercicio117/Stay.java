package exercicio117;

public class Stay {
    private static final double BREAKFAST_RATE = 30.0; //Constante criada para não ocorrer número aleatorio no codigo
    private Hotel hotel;
    private String guestName;
    private int numberOfNights;
    private boolean hasBreakfast;
    public Stay(Hotel hotel, String guestName, int numberOfNights, boolean hasBreakfast){
        this.hotel = hotel;
        this.guestName = guestName;
        this.hasBreakfast = hasBreakfast;
        if(numberOfNights <= 0){
            System.out.println("Quantidade de noites invalida.");
            this.numberOfNights = 1;
        } else{
            this.numberOfNights = numberOfNights;
        }
    }
    double calculateTotal(){
        if(!hasBreakfast){
            return hotel.getDailyRate() * numberOfNights;
        } else{
            return (hotel.getDailyRate() * numberOfNights) + (BREAKFAST_RATE * numberOfNights); 
        }
    }
    boolean confirmStay(){
        if(!hotel.bookRoom()){
            System.out.println("Não há quartos disponíveis.");
            return false;
        } else{
            return true;
        }
    }
}
