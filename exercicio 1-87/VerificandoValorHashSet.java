import java.util.HashSet;

public class VerificandoValorHashSet {
    public static void main(String[] args) {
        HashSet<Integer> matriculas = new HashSet<>();
        matriculas.add(1025);
        matriculas.add(2040);
        matriculas.add(3150);
        matriculas.add(4280);
        matriculas.add(5310);
        if(matriculas.contains(3150)){
            System.out.println("Matrícula encontrada.");
        } else{
            System.out.println("Matrícula não encontrada.");
        }
    }
}
