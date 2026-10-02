public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Civic", 80);
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Velocidade: " + veiculo.getVelocidadeAtual());
        System.out.println("Acima de 60: " + veiculo.estaAcimaDoLimite(60));
        System.out.println("Acima de 100: " + veiculo.estaAcimaDoLimite(100));
    }
}
