public class FreteGratis {
    public static void main(String[] args){
        double valorCompra = 150.00;
        boolean clientePremium = true;
        if(valorCompra >= 200.00 || clientePremium){
            System.out.println("Frete Grátis!");
        }else {
            System.out.println("Frete pago!");
        }
    }
}
