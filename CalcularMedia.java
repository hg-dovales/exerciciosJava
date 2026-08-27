public class CalcularMedia {
    public static void main(String[] args){
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;
        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);
    }
    public static double calcularMedia(double nota1, double nota2, double nota3){
        double resultado = (nota1 + nota2 + nota3)/3;
        return resultado;
    }
}