package exercicio123;

public class RepairShop {
    private String name;
    private double hourlyRate;
    private int availableSlots;
    public RepairShop(
        String name, 
        double hourlyRate, 
        int availableSlots){
        this.name = name;
        if(hourlyRate <= 0.0){
            System.out.println("Valor por hora invalido.");
            this.hourlyRate = 0.0;
        } else{
            this.hourlyRate = hourlyRate;
        }
        if(availableSlots < 0){
            System.out.println("Quantidade de vagas invalida.");
            this.availableSlots = 0;
        } else{
            this.availableSlots = availableSlots;
        }
    }
    String getName(){
        return name;
    }
    double getHourlyRate(){
        return hourlyRate;
    }
    int getAvailableSlots(){
        return availableSlots;
    }
    boolean acceptRepair(){
        if(availableSlots < 1){
            return false;
        } else{
            availableSlots -= 1;
            return true;
        }
    }
}
