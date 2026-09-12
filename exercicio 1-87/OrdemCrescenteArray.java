public class OrdemCrescenteArray {
    public static void main(String[] args) {
        int[] numero = {10, 20, 30, 45, 60, 80};
        int i;
        boolean crescente = true;
        for(i = 0; i < numero.length - 1; i++){
            if(numero[i] > numero[i + 1]){
                crescente = false;
                break;
            }
        }
        if(crescente){
            System.out.println("O array está em ordem crescente.");      
        }else{
            System.out.println("O array não está em ordem crescente.");
        }
    }     
}