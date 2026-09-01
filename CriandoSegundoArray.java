public class CriandoSegundoArray {
    public static void main(String[] args) {
        double[] preco ={50.0, 120.0, 80.0, 200.0, 150.0};
        double[]duplicaPreco = new double[5];
        int i;
        for(i = 0; i < preco.length; i++){
            duplicaPreco[i] = preco[i] - (preco[i] * 0.2);
            System.out.println("Preço com desconto: " + duplicaPreco[i]);
        }
    }
}