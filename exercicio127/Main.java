package exercicio127;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("Living Room", 22);
        System.out.println("Aumentar em 5°C: " + thermostat.increaseTemperature(5));
        System.out.println("Temperatura atual: " + thermostat.getTemperature() + "°C");
        System.out.println("Aumentar em 5°C: " + thermostat.increaseTemperature(5));
        System.out.println("Temperatura atual: " + thermostat.getTemperature() + "°C");
        System.out.println("Diminuir em 8°C: " + thermostat.decreaseTemperature(8));
        System.out.println("Temperatura atual: " + thermostat.getTemperature() + "°C");
        System.out.println("Diminuir em 5°C: " + thermostat.decreaseTemperature(5));
        System.out.println("Temperatura atual: " + thermostat.getTemperature() + "°C");
    }
}
