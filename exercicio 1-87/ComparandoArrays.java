public class ComparandoArrays {
     public static void main(String[] args) {
        double[] mes1 = {120, 200, 150, 90, 300};
        double[] mes2 = {150, 180, 170, 110, 280};
        int i;
        int quantidadeMaior = 0;
        for(i = 0; i < mes1.length; i++){
            if(mes2[i] > mes1[i]){
                quantidadeMaior++;
            }
        }
        System.out.println("Produtos que aumentaram as vendas: " + quantidadeMaior);
    }
}