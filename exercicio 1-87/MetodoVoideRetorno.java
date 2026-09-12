public class MetodoVoideRetorno {
    public static void main(String[] args){
        String nome = "Gabriel";
        double salarioBase = 4000.0;
        double bonus = 750.0;
        double salarioFinal = calcularSalarioFinal(salarioBase, bonus);
        exibirDados(nome, salarioFinal);
    }
    public static double calcularSalarioFinal(double salarioBase, double bonus){
        double salarioFinal = salarioBase + bonus;
        return salarioFinal;
    }
    public static void exibirDados(String nome, double salarioFinal){
        System.out.println("Nome: " + nome);
        System.out.println("Salário final: " + salarioFinal);
    }
}