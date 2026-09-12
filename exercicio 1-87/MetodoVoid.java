public class MetodoVoid {
    public static void main(String[] args){
        String nome = "Gabriel";
        String cargo = "Desenvolvedor";
        double salario = 4500.0; 
        exibirFuncionario(nome, cargo, salario);       
    }
    public static void exibirFuncionario(String nome, String cargo, double salario){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}