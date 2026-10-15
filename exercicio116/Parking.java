package exercicio116;

public class Parking {
    private ParkingLot parkingLot;
    private String licensePlate;
    private int numberOfHours;
    public Parking(ParkingLot parkingLot, String licensePlate, int numberOfHours){
        this.parkingLot = parkingLot;
        this.licensePlate = licensePlate;
        if(numberOfHours <= 0){
            System.out.println("Quantidade de horas invalida.");
            this.numberOfHours = 1;
        } else{
            this.numberOfHours = numberOfHours;
        }
    }
    double calculateTotal(){
        return numberOfHours * parkingLot.getHourlyRate();
    }
    boolean confirmParking(){
        if(!parkingLot.occupySpot()){
            System.out.println("Estacionamento lotado.");
            return false;
        } else{
            return true;
        }
    }
}
