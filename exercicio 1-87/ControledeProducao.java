public class ControledeProducao {
    public static void main(String[] args){
        int maquina = 1;
        int producao;
        int producaoTotal = 0;
        int maquinasMeta = 0;
        while(maquina <= 5){
            producao = maquina * 20;
            if(producao >= 60){
                System.out.println("Maquina " + maquina + " - Produção: " + producao + " - Meta atingida");
                maquinasMeta++;
            } else{
                System.out.println("Maquina " + maquina + " - Produção: " + producao + " - Meta não atingida");
            }
            maquina++;
            producaoTotal = producaoTotal + producao;
        }
        System.out.println("Produção total: " + producaoTotal);
        System.out.println("Maquinas que atingiram a meta: " + maquinasMeta);
    }
}