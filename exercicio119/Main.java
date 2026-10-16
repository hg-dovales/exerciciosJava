package exercicio119;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym("Power Gym", 100.0, 1);
        Membership membership = new Membership(gym, "Gabriel", 6, true);
        System.out.println("Academia: " + gym.getName());
        System.out.println("Valor: " + membership.calculateTotal());
        System.out.println("Vagas: " + gym.getAvailableSpots());
        membership.confirmMembership();
        System.out.println("Vagas: " + gym.getAvailableSpots());
        Membership membership2 = new Membership(gym, "Raquel", 3, false);
        membership2.confirmMembership();
        System.out.println("Vagas: " + gym.getAvailableSpots());
    }
}
