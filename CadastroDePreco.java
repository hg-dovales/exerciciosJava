import java.util.Scanner;

public class CadastroDePreco {
    public static final int PRECO_POSITIVO = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco = lerPreco(scanner);
        exibirPreco(preco);
        scanner.close();
    }
    public static double lerPreco(Scanner scanner){
        while(true){
            try{
                System.out.print("Digite o preço: ");
                String valor = scanner.nextLine().trim();
                double preco = Double.parseDouble(valor);
                if(preco <= PRECO_POSITIVO){
                    System.out.println("Preço inválido.");  
                    continue; 
                }
                return preco;
            } catch(NumberFormatException erro){
                System.out.println("Digite um número válido.");
            }
        }
    }
    public static void exibirPreco(double preco){
        System.out.println("Preço cadastrado: " + preco);
    }
}
