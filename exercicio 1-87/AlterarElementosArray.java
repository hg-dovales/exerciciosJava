public class AlterarElementosArray {
    public static void main(String[] args) {
        double[] preco = {100.0, 250.0, 80.0, 150.0, 300.0};
        int i;
        for(i = 0; i < preco.length; i++){
            preco[i] = preco[i] + (preco[i] * 0.1);
            System.out.println("Novo preço: " + preco[i]);
        }
    }
}