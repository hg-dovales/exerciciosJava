public class SomaValoresAltosArray {
    public static void main(String[] args) {
        int[] vendas = {120, 75, 200, 45, 160, 90, 250};
        int i;
        int somaAcimaCem = 0;
        for(i = 0; i < vendas.length; i++){
            if(vendas[i] >= 100){
                somaAcimaCem += vendas[i];
            }
        }
        System.out.println("Total das vendas acima ou iguais a 100: " + somaAcimaCem);
    }
}
