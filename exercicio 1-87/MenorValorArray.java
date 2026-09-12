public class MenorValorArray {
    public static void main(String[] args) {
        int[] tempoFuncionario = {42, 35, 50, 28, 39, 31};
        int indice = 0;
        int i = 0;
        int menorTempo = tempoFuncionario[0];
        for(i = 0; i < tempoFuncionario.length; i++){
            if(menorTempo > tempoFuncionario[i]){
                menorTempo = tempoFuncionario[i];
                indice = i;
            }
        }
        System.out.println("Menor Tempo: " + menorTempo);
        System.out.println("Índice: " + indice);
    }
}