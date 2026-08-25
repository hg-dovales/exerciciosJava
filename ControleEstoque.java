public class ControleEstoque {
    public static void main(String[] args){
        int produto;
        int disponivel = 0;
        int esgotado = 0;
        for(produto = 1; produto <= 10; produto++){
            if(produto % 2 == 0){
                disponivel++;
                System.out.println("Produto " + produto + ": disponível");
            } else{
                esgotado++;
                System.out.println("Produto " + produto + ": esgotado");
            }
        }
        System.out.println("Produtos disponíveis: " + disponivel);
        System.out.println("Produtos esgotados: " + esgotado);
    }
}