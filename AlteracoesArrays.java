public class AlteracoesArrays {
    public static void main(String[] args){
        double[] notaAntes = {6.0, 7.5, 4.0, 8.0, 5.5, 9.0};
        double[] notaDepois = {7.0, 7.5, 6.0, 8.5, 5.5, 9.0};
        int i;
        int notaAumentada = 0;
        int notaDiminuida = 0;
        int notaIgual = 0;
        for(i = 0; i < notaAntes.length; i++){
            if(notaDepois[i] > notaAntes[i]){
                notaAumentada++;
            } else if(notaDepois[i] < notaAntes[i]){
                notaDiminuida++;
            }else{
                notaIgual++;
            }
        }
        System.out.println("Notas aumentaram: " + notaAumentada);
        System.out.println("Notas diminuiram: " + notaDiminuida);
        System.out.println("Notas permaneceram iguais: " + notaIgual);
    }
}