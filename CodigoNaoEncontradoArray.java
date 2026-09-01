public class CodigoNaoEncontradoArray {
    public static void main(String[] args) {
        int[] codigoFuncionario = {110, 225, 340, 455, 570, 685};
        int buscarCodigo = 500;
        int i;
        int indiceFuncionario = -1;
        for(i = 0; i < codigoFuncionario.length; i++){
            if(codigoFuncionario[i] == buscarCodigo){
                indiceFuncionario = i;
                break;
            }
        }
        if(indiceFuncionario == -1){
            System.out.println("Código " + buscarCodigo + " não encontrado.");
        }
    }
}