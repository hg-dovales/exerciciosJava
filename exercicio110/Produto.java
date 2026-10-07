public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    public Produto(String nome, double precoInical, int estoqueInicial){
        this.nome = nome;
        if(precoInical < 0.0){
            System.out.println("Preço invalido.");
            this.preco = 0.0;
        } else{
            this.preco = precoInical;
        }
        if(estoqueInicial < 0){
            System.out.println("Estoque invalido.");
            this.estoque = 0;
        } else{
            this.estoque = estoqueInicial;
        }
    }
    String getNome(){
        return nome;
    }
    double getPreco(){
        return preco;
    }
    int getEstoque(){
        return estoque;
    }
    boolean removerEstoque(int quantidade){
        if(quantidade <= 0){
            return false;
        } else if(quantidade > this.estoque){
            return false;
        } else{
            this.estoque -= quantidade;
            return true;
        }
    }
}
