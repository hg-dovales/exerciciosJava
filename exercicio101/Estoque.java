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
    void removerEstoque(int quantidadeRemovida){
        if(quantidadeRemovida <= 0){
            System.out.println("Quantidade para remoção inválida.");
        }else if(quantidadeRemovida > this.quantidade){
            System.out.println("Estoque insuficiente.");
        }else{
            this.quantidade -= quantidadeRemovida; 
        }
    }
    String getProduto(){
        return produto;
    }
    int getQuantidade(){
        return quantidade;
    }
}
