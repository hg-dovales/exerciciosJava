public class PagamentoDivida {
    public static void main(String[] args){
        double divida = 500.0;
        double pagamento = 100.0;
        while(divida > 0){
            System.out.println("Pagamento realizado: " + pagamento);
            divida = divida - pagamento;
            System.out.println("Dívida restante: " + divida);
        }
        System.out.println("Dívida quitada!");
    }
}