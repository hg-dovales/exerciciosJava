public class Course {
    private String name;
    private double price;
    private int availableSpots;

    public Course(String name, double price, int availableSpots){
        this.name = name;

        if(price <= 0.0){
            System.out.println("Preço invalido.");
            this.price = 0.0;
        } else{
            this.price = price;
        }

        if(availableSpots < 0){
            System.out.println("Quantidade de vagas invalida.");
            this.availableSpots = 0;
        } else{
            this.availableSpots = availableSpots;
        }
    }

    String getName(){
        return name;
    }

    double getPrice(){
        return price;
    }

    int getAvailableSpots(){
        return availableSpots;
    }

    boolean enroll(){
        if(availableSpots < 1){
            return false;
        } else{
            availableSpots -= 1;
            return true;
        }
    }
}