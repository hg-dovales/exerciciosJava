public class ValorescomCondicaoArray {
    public static void main(String[] args) {
        double[] nota = {7.5, 4.0, 8.5, 6.0, 3.5, 9.0, 5.5};
        int i;
        int aprovado = 0;
        int reprovado = 0;
        for(i = 0; i < nota.length; i++){
            if(nota[i] >= 6.0){
                aprovado++;
            } else{
                reprovado++;
            }
        }
        System.out.println("Aprovados: " + aprovado);
        System.out.println("Reprovados: " + reprovado);
    }
}