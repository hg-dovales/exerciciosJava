public class SomarPares {
    public static void main(String[] args){
        int i;
        int soma = 0;
        for(i = 1; i <= 10; i++){
            if(i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("Soma dos números pares: " + soma);
    }
}