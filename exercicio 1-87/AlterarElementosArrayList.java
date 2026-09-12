import java.util.ArrayList;

public class AlterarElementosArrayList {
    public static void main(String[] args) {
        ArrayList<Double> precos = new ArrayList<>();
        precos.add(50.0);
        precos.add(80.0);
        precos.add(120.0);
        precos.add(40.0);
        for(int i = 0; i < precos.size(); i++){
            if(precos.get(i) == 80.0){
                precos.set(i, 90.0);
            } else if(precos.get(i) == 40.0){
                precos.remove(i);
            }
        }
        for(int i = 0; i < precos.size(); i++){
           System.out.println(precos.get(i));
        }
    }
}
