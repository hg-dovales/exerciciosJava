import java.util.Scanner;

public class CadastrarQuantidadeParcelas {
    private static final int MINIMO_PARCELAS = 1;
    private static final int MAXIMO_PARCELAS = 24;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parcelas = lerParcelas(scanner);
        exibirParcelas(parcelas);
        scanner.close();
    }
    public static int lerParcelas(Scanner scanner){
        int parcelas;
        while(true){
            try{
                System.out.print("Digite a quantidade de parcelas: ");
                String entrada = scanner.nextLine().trim();
                parcelas = Integer.parseInt(entrada);
                if(parcelas < MINIMO_PARCELAS || parcelas > MAXIMO_PARCELAS){
                    System.out.println("Quantidade de parcelas inválida.");
                    continue;
                }
                return parcelas;
            } catch(NumberFormatException erro){
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static void exibirParcelas(int parcelas){
        System.out.println("Parcelas cadastradas: " + parcelas);
    }
}
