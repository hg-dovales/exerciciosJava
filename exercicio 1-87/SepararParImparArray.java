public class SepararParImparArray {
    public static void main(String[] args) {
        int[] numero = {12, 7, 18, 5, 20, 9, 14, 3};
        int i;
        int[] numeroPar = new int[4];
        int[] numeroImpar = new int[4];
        int indicePar = 0;
        int indiceImpar = 0;
        for(i = 0; i < numero.length; i++){
            if(numero[i] % 2 == 0){
                numeroPar[indicePar] = numero[i];
                indicePar++;
            } else{
                numeroImpar[indiceImpar] = numero[i];
                indiceImpar++;
            }
        }
        System.out.println("Pares:");
        for(indicePar = 0; indicePar < numeroPar.length; indicePar++){
            System.out.println(numeroPar[indicePar]);
        }
        System.out.println("Impares:");
        for(indiceImpar = 0; indiceImpar < numeroImpar.length; indiceImpar++){
            System.out.println(numeroImpar[indiceImpar]);
        }
    }
}