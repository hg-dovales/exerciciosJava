public class ProcurarValorArray {
    public static void main(String[] args) {
        int[] codigoFuncionario = {102, 205, 310, 415, 523, 608};
        int buscarCodigo = 415;
        int i;
        int indiceFuncionario = -1;
        for(i = 0; i < codigoFuncionario.length; i++){
            if(codigoFuncionario[i] == buscarCodigo){
                indiceFuncionario = i;
                break;
            }
        }
        System.out.println("Codigo encontrado: " + buscarCodigo);
        System.out.println("Índice: " + indiceFuncionario);
    }
}