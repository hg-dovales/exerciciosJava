package exercicio126;

public class Smartphone {
    private String model;
    private int batteryLevel;
    public Smartphone(String model, int batteryLevel){
        this.model = model;
        if(batteryLevel < 0 || batteryLevel > 100){
            System.out.println("Nível de bateria inválido.");
            this.batteryLevel = 0;
        } else{
            this.batteryLevel = batteryLevel;
        }
    }
    String getModel(){
        return model;
    }
    int getBatteryLevel(){
        return batteryLevel;
    }
    boolean useBattery(int amount){
        if(amount <= 0){
            System.out.println("Consumo invalido.");
            return false;
        }
        if(amount > batteryLevel){
            System.out.println("Bateria insuficiente.");
            return false;
        }
        batteryLevel -= amount;
        return true;
    }
    void charge(int amount){
        if(amount <= 0){
            System.out.println("Carga invalida.");
        }else{
            batteryLevel +=amount;
            if(batteryLevel > 100){
                batteryLevel = 100;
            }
        }

    }
}
