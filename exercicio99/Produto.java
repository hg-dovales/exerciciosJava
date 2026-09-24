public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double precoInicial){
        this.nome = nome;
        this.preco = validarPreco(precoInicial);
    }
    public double validarPreco(double precoInicial){
        if(precoInicial < 0.0){
            System.out.println("Preço inicial inválido.");
            return 0.0;
        } else{
            return precoInicial;
        }
    }
    String getNome(){
        return nome;
    }
    double getPreco(){
        return preco;
    }
    void setPreco(double novoPreco){
        if(novoPreco < 0){
            System.out.println("Novo preço inválido.");
        } else{
            this.preco = novoPreco;
        }
    }
}
