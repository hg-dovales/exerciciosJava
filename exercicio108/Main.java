public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel", 2000.0);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário inical: " + funcionario.getSalario());
        funcionario.aumentarSalario(10);
        System.out.println("Salario apos aumento: " + funcionario.getSalario());
        System.out.println("Recebe mais que 2000.0: " + funcionario.recebeMaisQue(2000.0));
        funcionario.aumentarSalario(-5);
    }
}
