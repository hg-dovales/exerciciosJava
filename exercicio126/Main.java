package exercicio126;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Galaxy S23", 50);
        System.out.println("Consumo de bateria 15%: " + smartphone.useBattery(15));
        System.out.println("Consumo de bateria 30%: " + smartphone.useBattery(30));
        System.out.println("Consumo de bateria 10%: " + smartphone.useBattery(10));
        smartphone.charge(80);
        System.out.println("Bateria atual: " + smartphone.getBatteryLevel() + "%");
    }
}
