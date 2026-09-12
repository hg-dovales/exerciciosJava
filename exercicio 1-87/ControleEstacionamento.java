public class ControleEstacionamento {
    public static void main(String[] args){
        int vagas = 1;
        int vagasOcupada = 0;
        int vagasLivre = 0;
        while(vagas <= 8){
            if(vagas == 1 || vagas == 4 || vagas ==7){
                System.out.println("Vaga " + vagas + " - Ocupada");
                vagasOcupada++;
            } else{
                System.out.println("Vaga " + vagas + " - Livre");
                vagasLivre++;
            }
            vagas++;
        }
        System.out.println("Vagas ocupadas: " + vagasOcupada);
        System.out.println("Vagas livres: " + vagasLivre);
    }
}