
public class Valores {
    public static void main(String[] args) {
        final int VALOR_LIMITE = 400;
        int[] despesas = {350, 120, 890, 450, 670, 90};
        int totalDespesas = 0;
        int maiorDespesa = despesas[0];
        int quantidadeDespesasAcimaLimite = 0;
        for(int valores : despesas){
            totalDespesas += valores;
            if(valores > maiorDespesa){
                maiorDespesa = valores;
            }
            if(valores > VALOR_LIMITE){
                quantidadeDespesasAcimaLimite += 1;
            }
        }
        System.out.println("Total de despesas: " + totalDespesas);
        System.out.println("Maior despesa:: " + maiorDespesa);
        System.out.println("Despesas acima de 400: " + quantidadeDespesasAcimaLimite);
    }
}
