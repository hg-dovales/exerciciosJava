public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double precoInicial){
        this.nome = nome;
        if(precoInicial < 0){
            this.preco = 0.0;
            System.out.println("Preço inicial inválido.");
        }else{
            this.preco = precoInicial;
        }
    } 
    String getNome(){
        return nome;
    }   
    double getPreco(){
        return preco;
    }
    double calcularPrecoComDesconto(double percentualDesconto){
        double precoComDesconto;
        if(percentualDesconto >= 0.0 && percentualDesconto <= 100.0){
            percentualDesconto = percentualDesconto / 100;
            precoComDesconto = preco - (preco * percentualDesconto);
            return precoComDesconto;
        }else{
            System.out.println("Percentual de desconto inválido.");
            return preco;
        }
    }
}
