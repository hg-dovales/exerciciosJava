public class SomaValorLimiteArray {
    public static void main(String[] args) {
        int[] valor = {15, 42, 8, 30, 55, 21, 60, 12};
        int i;
        int somaValor = 0;
        for(i = 0; i < valor.length; i++){
            if(valor[i] >= 20 && valor[i] <= 50){
                somaValor += valor[i];
            }
        }
        System.out.println("Soma dos valores entre 20 e 50: " + somaValor);
    }
}