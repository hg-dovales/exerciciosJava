public class MaiorDiferencaArray {
    public static void main(String[] args) {
        int[] mes1 = {100, 150, 200, 120, 180, 90};
        int[] mes2 = {130, 140, 260, 150, 200, 160};
        int i;
        int indice = -1;
        int aumento = 0;
        int maiorAumento = 0;
        for(i = 0; i < mes1.length; i++){
            if(mes2[i] > mes1[i]){
                aumento = mes2[i] - mes1[i];
                if(aumento > maiorAumento){
                    maiorAumento = aumento;
                    indice = i;
                }
            }
        }
        System.out.println("Maior aumento: " + maiorAumento);
        System.out.println("Índice do produto: "+ indice);
    }
}