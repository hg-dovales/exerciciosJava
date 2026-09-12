public class InverterArray {
    public static void main(String[] args){
        int[] array = {10, 20, 30, 40, 50};
        int[] invertArray = new int[5];
        int i;
        int indiceArray = array.length;
        for(i = 0; i < array.length; i++){
            indiceArray--;
            invertArray[i] = array[indiceArray];
            System.out.println( invertArray[i]);
        }

    }
}