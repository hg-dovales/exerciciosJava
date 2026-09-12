public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;
    public Produto(String nomeInicial, double precoInicial, int quantidadeEstoqueInicial){
        nome = nomeInicial;
        preco = precoInicial;
        quantidadeEstoque = quantidadeEstoqueInicial;
    }
    int adicionarEstoque(int quantidadeAdicionada){
        int quantidadeAtual = quantidadeEstoque + quantidadeAdicionada;
        quantidadeEstoque = quantidadeAtual;
        return quantidadeEstoque;
    }
    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}
