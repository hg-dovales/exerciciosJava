public class Emprestimo {
    private Livro livro;
    private String usuario;
    public Emprestimo(Livro livro, String usuario){
        this.livro = livro;
        this.usuario = usuario;
    }
    boolean realizarEmprestimo(){
        if(!livro.emprestar()){
            System.out.println("Livro indisponivel.");
            return false;
        }else{
            return true;
        }
    }
}
