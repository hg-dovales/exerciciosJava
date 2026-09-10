import java.util.Scanner;

public class NotaDeAluno {
    private static final double MINIMA_NOTA = 0.0;
    private static final double MAXIMA_NOTA = 10.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = lerNota(scanner);
        exibirNota(nota);
        scanner.close();
    }
    public static double lerNota(Scanner scanner){
        while(true){
            try{
                System.out.print("Digite a nota:: ");
                String valor = scanner.next();
                double nota = Double.parseDouble(valor);
                if(nota<MINIMA_NOTA || nota>MAXIMA_NOTA){
                    System.out.println("Nota inválida.");
                    continue;
                } 
                return nota;
            }catch(NumberFormatException erro){
                System.out.println("Formato inválida.");
            }  
        }
    }
    public static void exibirNota(Double nota){
        System.out.println("Nota cadastrada: "+nota);
    }
}
