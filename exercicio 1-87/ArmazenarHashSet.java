import java.util.HashSet;

public class ArmazenarHashSet {
    public static void main(String[] args) {
        HashSet<String> codigoUtilizados = new HashSet<>();
        codigoUtilizados.add("PROMO10");
        codigoUtilizados.add("BLACK20");
        codigoUtilizados.add("PROMO10");
        codigoUtilizados.add("FRETEGRATIS");
        codigoUtilizados.add("BLACK20");
        for(String codigo : codigoUtilizados ){
            System.out.println(codigo);     
        }
        System.out.println("Quantidade de códigos diferentes: " + codigoUtilizados.size());
    }
}
