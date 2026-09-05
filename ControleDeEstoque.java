import java.util.Scanner;

public class ControleDeEstoque {
    private static final int ESTOQUE_BAIXO = 5;    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[produtos.length];
        receberDados(scanner, produtos, quantidades);
        int quantidadeTotal = calcularQuantidadeTotal(quantidades);
        int produtoEstoqBaixo = calcularProdutoEstoqBaixo(quantidades);
        exibirRelatorio(quantidadeTotal, produtoEstoqBaixo);
        scanner.close();
    }
    public static void receberDados(Scanner scanner, String[] produtos, int[] quantidades){
        for(int i = 0; i < produtos.length; i++){
            produtos[i] = lerProduto(scanner);
            quantidades[i] = lerQuantidadeValida(scanner, produtos[i]);
        }
    }
    public static String lerProduto(Scanner scanner){
        String produto;
        System.out.print("Nome do produto: ");
        produto = scanner.next();
        return produto;
    }
    public static int lerQuantidadeValida(Scanner scanner, String produtos){
        int quantidade;
        do{
            System.out.print("Quantidade de " + produtos + ":");
            quantidade = scanner.nextInt();
            if (quantidade < 0){
                System.out.println("O valor não pode ser negativo.");
            }
        } while(quantidade < 0);
        return quantidade;
    }
    public static void exibirRelatorio(int quantidadeTotal, int produtoEstoqBaixo){
        System.out.println("Total de itens em estoque: " + quantidadeTotal);
        System.out.println("Produtos com estoque baixo: " + produtoEstoqBaixo);
    }
    public static int calcularQuantidadeTotal(int[] quantidades){
        int total = 0;
        for(int i = 0; i < quantidades.length; i++){
            total += quantidades[i];
        }
        return total;
    }
    public static int calcularProdutoEstoqBaixo(int[] quantidades){
        int total = 0;
        for(int i = 0; i < quantidades.length; i++){
            if(quantidades[i] < ESTOQUE_BAIXO){
            total++;
           }
        }
        return total;
    }
}