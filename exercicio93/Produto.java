package exercicio93;
public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;
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
            System.out.println("Retirada realizada.");
            quantidadeEstoque -= quantidadeRetirada;
        } 
    }
    void exibirDados(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}
