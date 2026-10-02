public class Aluno {
    private String nome;
    private double nota;
    public Aluno(String nomeInicial, double notaInicial){
        this.nome = nomeInicial;
        if(notaInicial >= 0.0 && notaInicial <= 10.0){
            this.nota = notaInicial;
        }else{
            System.out.println("Nota inválida");
            this.nota = 0.0;
        }
    }
    String getNome(){
        return nome;
    }
    double getNota(){
        return nota;
    }
    boolean verificarAprovacao(){
        if(nota >= 6.0){
            return true;
        }else{
            return false;
        }
    }
}   

