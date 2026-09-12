public class MediaNotaMatriz {
    public static void main(String[] args) {
        double[][] notaAluno = {
            {7.0, 8.0},
            {6.5, 9.0},
            {5.0, 7.5}
        };
        double[] notaTotalAluno = new double[3];
        double[] mediaAluno = new double[3];
        int linha;
        int coluna;
        for(linha = 0; linha < notaAluno.length; linha++){
            for(coluna = 0; coluna < notaAluno[linha].length; coluna++){
                notaTotalAluno[linha] += notaAluno[linha][coluna];
            }
            mediaAluno[linha] = notaTotalAluno[linha] / notaAluno[linha].length;
                System.out.println("Aluno " + (linha + 1) + " - Média: " + mediaAluno[linha]);
        }
    }
}
