package exercicio123;

public class Main {
    public static void main(String[] args) {
        RepairShop repairShop = new RepairShop("Auto Fix", 50.0, 1);
        RepairOrder repairOrder = new RepairOrder(repairShop, "Civic", 3, true, true);
        System.out.println("Oficina: " + repairShop.getName());
        System.out.println("Valor: " + repairOrder.calculateTotal());
        System.out.println("Vagas: " + repairShop.getAvailableSlots());
        repairOrder.confirmRepair();
        System.out.println("Vagas: " + repairShop.getAvailableSlots());
        RepairOrder repairOrder2 = new RepairOrder(repairShop, "Colrolla", 2, false, false);
        repairOrder2.confirmRepair();
        System.out.println("Vagas: " + repairShop.getAvailableSlots());
    }
}
