import java.util.ArrayList;

public class RemocaoNoPercuso {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(10);
        numero.add(20);
        numero.add(30);
        numero.add(40);
        numero.add(50);
        for(int i = 0; i < numero.size(); i++){
            if(numero.get(i) < 30){
                numero.remove(i);
                i--;
            }
        }
        for(int i = 0; i < numero.size(); i++){
            System.out.println(numero.get(i));        
        }
    }
}
