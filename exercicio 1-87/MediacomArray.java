public class MediacomArray {
    public static void main(String[] args) {
        double[] notaAluno = {7.5, 8.0, 6.0, 9.5, 7.0};
        int i;
        double somaNotasAluno = 0;
        double mediaAluno;
        for(i = 0; i < notaAluno.length; i++){
            somaNotasAluno += notaAluno[i];
        }
        mediaAluno = somaNotasAluno / notaAluno.length;
        System.out.println("Média das notas: " + mediaAluno);
    }
}