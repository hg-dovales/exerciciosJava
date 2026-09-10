import java.util.Scanner;

public class CadastrarAno {
    private static final int LIMITE_MINIMO_ANO = 1900;
    private static final int LIMITE_MAXIMO_ANO = 2026;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoFabricacao = lerAno(scanner);
        exibirAnoFabricacao(anoFabricacao);
        scanner.close();
    }
    public static int lerAno(Scanner scanner){
        int anoFabricacao;
        while(true){
            try{
                System.out.print("Cadastrar ano de fabricação: ");
                String entrada = scanner.nextLine().trim();
                anoFabricacao = Integer.parseInt(entrada);
                if(anoFabricacao < LIMITE_MINIMO_ANO || anoFabricacao > LIMITE_MAXIMO_ANO){
                    System.out.println("Ano inválido.");
                    continue;
                }
                return anoFabricacao;
            } catch(NumberFormatException erro){
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static void exibirAnoFabricacao(int anoFabricacao){
        System.out.println("Ano cadastrado: " + anoFabricacao);
    }
}
