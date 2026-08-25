public class ControledeVendas{
    public static void main(String[] args){
        int dia;
        double vendaDia = 120.00;
        double totalVenda = 0;
        for(dia = 1; dia <= 7; dia ++){
            totalVenda = totalVenda + vendaDia;
            if(vendaDia >= 100.00){
                System.out.println("Meta do dia " + dia + " atingida!");
            } else{
                System.out.println("Meta do dia " + dia + " não atingida!");
            }
        }
        System.out.println("Total vendido: " + totalVenda);
    }
}