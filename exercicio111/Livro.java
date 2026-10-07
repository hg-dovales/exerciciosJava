public class Livro {
    private String titulo;
    private boolean disponivel;
    public Livro(String titulo){
        this.titulo = titulo;
        this.disponivel = true;
    }
    String getTitulo(){
        return titulo;
    }
    boolean getDisponibilidade(){
        return disponivel;
    }
    boolean emprestar(){
        if(this.disponivel){
            this.disponivel = false;
            return true;
        }else{
            return false;
        }
    }
    void devolver(){
        this.disponivel = true;
    }
}
