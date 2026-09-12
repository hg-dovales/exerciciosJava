import java.util.Scanner;

public class CadastrarIdade {
    public static final int MINIMO_IDADE = 0;
    public static final int MAXIMO_IDADE = 120;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = receberIdade(scanner);
        exibirIdade(idade);
        scanner.close();
    }
    public static int receberIdade(Scanner scanner){
        int idade;
        do{
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            if(idade < MINIMO_IDADE || idade > MAXIMO_IDADE){
                System.out.println("Idade Invalida");
            } 
        } while(idade < 0 || idade > 120);
        return idade;
    }
    public static void exibirIdade(int idade){
        System.out.println("Idade cadastrada: " + idade);
    }
}