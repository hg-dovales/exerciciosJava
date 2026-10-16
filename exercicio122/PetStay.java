package exercicio122;

public class PetStay{
    private static final double BATH_PRICE = 40.0;
    private static final double LONG_STAY_PRICE_RATE = 0.90;
    private PetHotel petHotel;
    private String petName;
    private int numberOfDays;
    private boolean needsBath;
    public PetStay(PetHotel petHotel, String petName, int numberOfDays, boolean needsBath){
        this.petHotel = petHotel;
        this.petName = petName;
        this.needsBath = needsBath;
        if(numberOfDays <= 0){
            System.out.println("Quantidades de dias invalida.");
            this.numberOfDays = 1;
        } else{
            this.numberOfDays = numberOfDays;
        }
    }
    double calculateTotal(){
        if(numberOfDays >= 7 && needsBath){
            return (numberOfDays * petHotel.getDailyRate() * LONG_STAY_PRICE_RATE) + BATH_PRICE;
        } else if(needsBath){
            return (numberOfDays * petHotel.getDailyRate()) + BATH_PRICE;
        } else if(numberOfDays >= 7){
            return numberOfDays * petHotel.getDailyRate() * LONG_STAY_PRICE_RATE;
        } else{
            return numberOfDays * petHotel.getDailyRate();
        }
    }
    boolean confirmStay(){
        if(!petHotel.reserveSpace()){
            System.out.println("Nao ha vagas disponiveis.");
            return false;
        } else{
            return true;
        }
    }
}