public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Civic", 50);
        veiculo.acelerar(30);
        veiculo.frear(20);
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Velocidade: " + veiculo.getVelocidadeAtual());
        System.out.println("Acima de 50: " + veiculo.estaAcimaDoLimite(50));
        veiculo.frear(100);
        System.out.println("Velocidade após frear: " + veiculo.getVelocidadeAtual());
    }
}
