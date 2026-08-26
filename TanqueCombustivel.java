public class TanqueCombustivel {
    public static void main(String[] args){
        int viagem = 0;
        double combustivel = 50.0;
        double consumo = 10.0;
        while(combustivel >= consumo){
            viagem++;
            System.out.println("Viagem " + viagem + " realizada");
            combustivel = combustivel - consumo;
            System.out.println("Combustível restante: " + combustivel);
        }
        System.out.println("Total de viagens: " + viagem);
    }
}