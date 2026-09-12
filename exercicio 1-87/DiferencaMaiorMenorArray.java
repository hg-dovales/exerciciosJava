public class DiferencaMaiorMenorArray {
    public static void main(String[] args) {
        int[] temp = {22, 28, 19, 31, 25, 18, 27};
        int i;
        int maiorTemp = temp[0];
        int menorTemp = temp[0];
        int diferencaTemp = 0;
        for(i = 0; i < temp.length; i++){
            if(temp[i] > maiorTemp){
                maiorTemp = temp[i];
            } else if(temp[i] < menorTemp){
                menorTemp = temp[i];
            }
        }
        diferencaTemp = maiorTemp - menorTemp;
        System.out.println("Maior temperatura: " + maiorTemp);
        System.out.println("Menor temperatura: " + menorTemp);
        System.out.println("Diferença: " + diferencaTemp);
    }
}