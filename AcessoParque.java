public class AcessoParque {
    public static void main(String[] args){
        int idade = 25;
        boolean ingressoVIP = false;
        boolean ingressoComum = true;
        if(idade >= 18 && ingressoVIP){
            System.out.println("Acesso VIP!");
        } else if(idade >= 18 && ingressoComum){
            System.out.println("Acesso Comum!");
        } else if(idade < 12){
            System.out.println("Entrada Gratuita!");
        } else{
            System.out.println("Entrada não permitida!");
        }
    }
}