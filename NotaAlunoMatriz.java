public class NotaAlunoMatriz {
    public static void main(String[] args) {
        double[][] notaAluno = {
            {7.0, 8.0},
            {6.5, 9.0},
            {5.0, 7.5}
        };
        int linha;
        int coluna;
        for(linha = 0; linha < notaAluno.length; linha++){
            for(coluna = 0; coluna < notaAluno[linha].length; coluna++){
                System.out.println("Aluno " + (linha + 1) + " - Prova: " + (coluna + 1) + notaAluno[linha][coluna]);
            }
        }
    }
}
