class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;
    void exibirDados(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}