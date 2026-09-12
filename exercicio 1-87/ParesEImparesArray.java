public class ParesEImparesArray {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 20, 15, 8, 3, 10, 21};
        int i;
        int par = 0;
        int impar = 0;
        for(i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                par++;
            } else{
                impar++;
            }
        }
        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de impares: " + impar);
    }
}