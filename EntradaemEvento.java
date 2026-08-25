public class EntradaemEvento {
    public static void main(String[] args){
        int idade = 20;
        boolean temIngresso = true;
        if(idade >= 18 && temIngresso){
            System.out.println("Entrada permitida!");
        }else{
            System.out.println("Entrada negada!");
        }
    }
}