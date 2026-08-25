public class AprovacaoEmprestimo {
    public static void main(String[] args){
        int idade = 25;
        double rendaMensal = 2500.00;
        boolean negativado = false;
        if(idade >= 18 && rendaMensal >= 2000.00 && negativado == false) {
            System.out.println("Empréstimo Aprovado!");
        } else{
            System.out.println("Empréstimo Negado!");
        }
    }
}
