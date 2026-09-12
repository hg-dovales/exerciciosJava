import java.util.ArrayList;

public class BuscarElementoArrayList {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Ana");
        nome.add("Carlos");
        nome.add("Mariana");
        nome.add("João");
        nome.add("Pedro");
            if(nome.contains("Mariana")){
                System.out.println("Mariana está cadastrada.");
            } else{
                System.out.println("Mariana não está cadastrada.");
            }
    }
}
