public class Estoque {
    private String produto;
    private int quantidade;
    public Estoque(String nomeInicial, int quantidadeInicial){
        this.produto = nomeInicial;
        this.quantidade = validarQuantidade(quantidadeInicial);
    }
    int validarQuantidade(int quantidadeInicial){
        if(quantidadeInicial < 0){
            System.out.println("Quantidade inicial inválida.");
            return 0;
        } else{
            return quantidadeInicial;
        }
    }
    void adicionarEstoque(int quantidadeEstoqueAdicionada){
        if(quantidadeEstoqueAdicionada <= 0){
            System.out.println("Quantidade para adição inváida");
        } else{
            this.quantidade += quantidadeEstoqueAdicionada;
        }
    }
    String getProduto(){
        return produto;
    }
    int getQuantidade(){
        return quantidade;
    }
}
