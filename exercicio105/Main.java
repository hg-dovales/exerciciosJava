public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", 7.5);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        if(aluno.verificarAprovacao()){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }
    }
}
