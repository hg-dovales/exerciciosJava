import java.util.Scanner;

public class ExemploFacul {
    private static final int LIMITE_ESTOQUE_BAIXO = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = {"Teclado","Mouse","Monitor","Fone","Webcam"};
        int[] quantidades = new int[produtos.length];
        preencherEstoques(scanner, produtos, quantidades);
        int totalItens = calcularTotal(quantidades);
        exibirRelatorio(produtos, quantidades, totalItens);
        scanner.close();
    }
    public static void preencherEstoques(Scanner scanner,String[] produtos,int[] quantidades){
        for (int indice = 0; indice < produtos.length; indice++) {
            quantidades[indice] = lerQuantidadeValida(scanner, produtos[indice]);
        }
    }
    public static int lerQuantidadeValida(Scanner scanner,String produto) {
        int quantidade;
        do {
            System.out.print("Quantidade de " + produto + ": ");
            quantidade = scanner.nextInt();
            if (quantidade < 0) {
                System.out.println("O valor não pode ser negativo.");
            }
        } while (quantidade < 0);
        return quantidade;
    }
    public static int calcularTotal(int[] quantidades) {
        int total = 0;
        for (int quantidade : quantidades) {
            total += quantidade;
        }
        return total;
    }
    public static void exibirRelatorio(String[] produtos,int[] quantidades,int totalItens) {
        System.out.println();
        System.out.println("RELATÓRIO DE ESTOQUE");
        for (int indice = 0; indice < produtos.length; indice++) {
            System.out.println(
                produtos[indice]+ ": "+ quantidades[indice]+ " unidade(s)");
            if (quantidades[indice] < LIMITE_ESTOQUE_BAIXO) {
                System.out.println(" Atenção: estoque baixo.");
            }
        }
        System.out.println("Total de itens: " + totalItens);
    }
}