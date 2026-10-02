public class Veiculo {
    private String modelo;
    private int velocidadeAtual;
    public Veiculo(String modelo, int velocidadeInicial){
        this.modelo = modelo;
        if(velocidadeInicial < 0){
            System.out.println("Velocidade inicial inválida.");
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
    boolean estaAcimaDoLimite(int limite){
        if(limite <= 0){
            System.out.println("Limite inválido.");
            return false;
        }else if(this.velocidadeAtual > limite){
            return true;
        }else{
            return false;
        }
    }
}
