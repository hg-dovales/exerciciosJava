public class Veiculo {
    private String modelo;
    private int velocidadeAtual;
    public Veiculo(String modelo, int velocidadeInicial){
        this.modelo = modelo;
        if(velocidadeInicial < 0){
            System.out.println("Velocidade inicial invalida.");
            this.velocidadeAtual = 0;
        }else{
            this.velocidadeAtual = velocidadeInicial;
        }
    }
    String getModelo(){
        return modelo;
    }
    int getVelocidadeAtual(){
        return velocidadeAtual;
    }
    void acelerar(int aumento){
        if(aumento<= 0){
            System.out.println("Aumento de velocidade invalido.");  
        }else{
            this.velocidadeAtual += aumento;
        }
    }
    void frear(int reducao){
        if(reducao <= 0){
            System.out.println("Redução de velocidade inválida.");
        } else if(reducao > this.velocidadeAtual){
            this.velocidadeAtual = 0;
        } else{
            this.velocidadeAtual -= reducao;
        }
    }
    boolean estaAcimaDoLimite(int limite){
        if(limite <= 0){
            System.out.println("Limite invalido.");
            return false;
        } else if(this.velocidadeAtual > limite){
            return true;
        } else{
            return false;
        }
    }
}
