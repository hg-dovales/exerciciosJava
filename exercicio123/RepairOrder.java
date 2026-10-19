package exercicio123;

public class RepairOrder {
    private static final double ADDITIONAL_PARTS = 150.0;
    private static final double PRIORITY_RATE = 80.0;
    private RepairShop repairShop;
    private String vehicleModel;
    private int numberOfHours;
    private boolean needsParts;
    private boolean isPriority;
    public RepairOrder(
        RepairShop repairShop, 
        String vehicleModel, 
        int numberOfHours, 
        boolean needsParts, 
        boolean isPriority){
            this.repairShop = repairShop;
            this.vehicleModel = vehicleModel;
            this.needsParts = needsParts;
            this.isPriority = isPriority;
            if(numberOfHours <= 0){
                System.out.println("Quantidade de horas inválida.");
                this.numberOfHours = 1;
            } else{
                this.numberOfHours = numberOfHours;
            }
    }
    double calculateTotal(){
        double total = repairShop.getHourlyRate() * numberOfHours;
        if(needsParts){
            total += ADDITIONAL_PARTS;
        }
        if(isPriority){
            total += PRIORITY_RATE;
        }
        return total;
    }
    boolean confirmRepair(){
        if(!repairShop.acceptRepair()){
            System.out.println("Não há vagas disponíveis.");
            return false;
        } else{
            return true;
        }
    }
}
