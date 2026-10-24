package exercicio127;

public class Thermostat {
    private static final int MINIMUM_TEMP = 16;
    private static final int MAXIMUM_TEMP = 30;
    private String location;
    private int temperature;
    public Thermostat(String location, int temperature){
        this.location = location;
        if(temperature < MINIMUM_TEMP || temperature > MAXIMUM_TEMP){
            System.out.println("Temperatura inicial inválida.");
            this.temperature = 20;
        } else{
            this.temperature = temperature;
        }
    }
    String getLocation(){
        return location;
    }
    int getTemperature(){
        return temperature;
    }
    boolean increaseTemperature(int amount){
        if(amount <= 0){
            System.out.println("Quantidade inválida.");
            return false;
        }
        if(temperature + amount  > MAXIMUM_TEMP){
            return false;
        }
        temperature += amount;
        return true;
    }
    boolean decreaseTemperature(int amount){
        if(amount <= 0){
            System.out.println("Quantidade inválida.");
            return false;
        }
        if(temperature - amount < MINIMUM_TEMP){
            return false;
        }
        temperature -= amount;
        return true;
    }
}
