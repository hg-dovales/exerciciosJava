public class ControleEntregas{
    public static void main(String[] args){
        int entregas = 1;
        int entregasRealizada = 0;
        int entregasCancelada = 0;
        while(entregas <= 10){
            if(entregas == 2 || entregas == 5 || entregas == 9){
                System.out.println("Entrega " + entregas + " - Cancelada");
                entregasCancelada++;
            } else{
                System.out.println("Entrega " + entregas + " - Realizada");
                entregasRealizada++;
            }
            entregas++;
        }
        System.out.println("Entregas realizadas: " + entregasRealizada);
        System.out.println("Entregas canceladas: " + entregasCancelada);
    }
}