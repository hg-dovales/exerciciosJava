public class ArraysIguais {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {10, 20, 30, 40, 50};
        int i;
        boolean iguais = true;
        for(i = 0; i < array1.length; i++){
            if(array2[i] != array1[i]){
                iguais = false;
                break;
            }
        }
        if(iguais){
            System.out.println("Os arrays são iguais.");
        }else{
            System.out.println("Os arrays não são iguais.");
        }
    }  
}