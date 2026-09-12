import java.util.Scanner;

public class CadastrarPeso {
    private static final double PESO_MINIMO = 0.0;
    private static final double PESO_MAXIMO = 50.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = lerPeso(scanner);
        exibirRelatorio(peso);
        scanner.close();
    }
    public static double lerPeso(Scanner scanner){
        double peso;
        while(true){
            try {
                System.out.print("Digite o peso: ");
                String entrada = scanner.nextLine().trim();
                peso = Double.parseDouble(entrada);
                if(peso <= PESO_MINIMO ){
                    System.out.println("Peso inválido.");
                    continue;
                } else if(peso > PESO_MAXIMO){
                    System.out.println("Peso acima do permitido.");
                    continue;
                    
                }
                return peso;
            } catch (NumberFormatException erro) {
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static void exibirRelatorio(double peso){
        System.out.println("Peso cadastrado: " + peso);
        if(peso <= 10.0){
            System.out.println("Categoria: Leve");
        } else if(peso <= 30.0){
            // Não é preciso mencionar que o peso deva ser maior que 10.0, pois para o programa chegar aqui o primeiro if foi considerado false.
            System.out.println("Categoria: Média");
        } else {
            System.out.println("Categoria: Pesada");
        }
    }
}