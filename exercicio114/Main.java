public class Main{
    public static void main(String[] args) {
        Car car = new Car("Civic", 180.0);
        Rental rental = new Rental(car, "Gabriel", 4);
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Total: " + rental.calculateTotal());
        rental.confirmRental();
        System.out.println("Disponivel: " + car.getAvailable());
        Rental rental2 = new Rental(car, "Raquel", 2);
        rental2.confirmRental();
        car.returnCar();
        rental2.confirmRental();
        System.out.println("Disponivel: " + car.getAvailable());
    }
}