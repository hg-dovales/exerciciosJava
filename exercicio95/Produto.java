public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    public Produto(String nomeInicial, double precoInicial, int quantidadeEstoqueInicial){
        nome = nomeInicial;
        preco = precoInicial;
        quantidadeEstoque = quantidadeEstoqueInicial;
    }
    void adicionarQuantidadeEstoque(int quantidadeAdicionada){
        quantidadeEstoque += quantidadeAdicionada;
    }
    void retirarQuantidadeEstoque(int quantidadeRetirada){
        if(quantidadeRetirada > quantidadeEstoque){
            System.out.println("Estoque Insuficiente.");
        } else{
            quantidadeEstoque -= quantidadeRetirada;
            System.out.println("Retirada realizada.");
        } 
    }
    int retornarQuantidadeEstoque(){
        return quantidadeEstoque;
    }
}
