public class MaiorValorEQuantidadeArray {
    public static void main(String[] args) {
        int[] vendaFuncionario = {15, 22, 18, 22, 10, 22, 17, 20};
        int i;
        int maiorNumeroVendas = 0;
        int destaqueFuncionario = 0;
        for(i = 0; i < vendaFuncionario.length; i++){
            if(vendaFuncionario[i] > maiorNumeroVendas){
                maiorNumeroVendas = vendaFuncionario[i];
            }
        }
        for(i = 0; i < vendaFuncionario.length; i++){
            if(vendaFuncionario[i] == maiorNumeroVendas){
                destaqueFuncionario++;
            }
        }
        System.out.println("Maior número de vendas: " + maiorNumeroVendas);
        System.out.println("Quantidade de funcionários com esse valor: " + destaqueFuncionario);
    }
}