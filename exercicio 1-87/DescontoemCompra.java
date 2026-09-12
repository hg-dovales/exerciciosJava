public class DescontoemCompra {
    public static void main(String[] args){
        double valorCompra = 150.00;
        double valorFinal;
        if (valorCompra >= 100.00) {
            valorFinal = valorCompra - 10.00;
        }else {valorFinal = valorCompra;
            }
            System.out.println(valorFinal);
    }
}