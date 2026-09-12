public class ValorRepeditoArray {
    public static void main(String[] args) {
        int[] numero = {10, 25, 30, 25, 40, 10, 50};
        int i;
        int procuraNumero = 25;
        int contar = 0;
        for(i = 0; i < numero.length; i++){
            if(numero[i] == procuraNumero){
                contar++;
            }
        }
        System.out.println("O número 25 aparece " + contar + " vezes.");
    }
}