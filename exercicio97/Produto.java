public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    public Produto(String nomeInicial, double precoInicial, int quantidadeEstoqueInicial){
        nome = nomeInicial;
        preco = precoInicial;
        quantidadeEstoque = quantidadeEstoqueInicial;
    }
    String getNome(){
        return nome;
    }
    double getPreco(){
        return preco;
    }
    int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    void setPreco(double novoPreco){
        if(novoPreco <= 0){
            System.out.println("Preço inválido.");
        } else{
            preco = novoPreco;
        }
    }
}
