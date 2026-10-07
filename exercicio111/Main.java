public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Básico");
        Emprestimo emprestimo = new Emprestimo(livro, "Gabriel");
        emprestimo.realizarEmprestimo();
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Disponível: " + livro.getDisponibilidade());
        Emprestimo emprestimo2 = new Emprestimo(livro, "Raquel");
        emprestimo2.realizarEmprestimo();
    }    
}
