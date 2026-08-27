public class Modularizacao {
    public static void main(String[] args){
        int numero = 8;
        int numeroDobro = calcularDobro(numero);
        System.out.println("O dobro de " + numero + " é : " + numeroDobro);
    }
    public static int calcularDobro(int numero2){
        int resultado = numero2 * 2;
        return resultado;
    }
}