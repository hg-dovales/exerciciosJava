public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double precoInicial){
        this.nome = nome;
        if(precoInicial < 0){
            System.out.println("Preço inicial inválido.");
        }else{
            this.preco = precoInicial;
        }
    } 
    String getNome(){
        return nome;
    }   
    double getpreco(){
        return preco;
    }
    
}
