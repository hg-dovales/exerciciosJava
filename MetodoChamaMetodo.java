public class MetodoChamaMetodo {
    public static void main(String[] args){
        double salarioBase = 3000.0;
        double bonus = 500.0;
        double salarioLiquido = calcularSalarioBruto(salarioBase, bonus);
        System.out.println("Salário base: " + salarioBase);
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
    public static double calcularSalarioBruto(double salarioBase, double bonus){
        double salarioBruto = salarioBase + bonus;
        double salarioLiquido = calcularSalarioLiquido(salarioBruto);
        return salarioLiquido;
    }
    public static double calcularSalarioLiquido(double salarioBruto){
            double salarioLiquido = salarioBruto - salarioBruto * 0.1;
            return salarioLiquido;
    }
}