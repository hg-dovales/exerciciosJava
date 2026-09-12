import java.util.Scanner;

public class CadastroDeTemperatura {
        private static final double MINIMO_TEMPERATURA = -30.0;
        private static final double MAXIMA_TEMPERATURA =  10.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura = lerTemperatura(scanner);
        exibirTemperatura(temperatura);
        scanner.close();
    }
    public static double lerTemperatura(Scanner scanner){
        double temperatura;
        while(true){
            try{
                System.out.print("Digite a temperatura: ");
                String valor = scanner.nextLine().trim(); 
                temperatura = Double.parseDouble(valor);
                if(temperatura<MINIMO_TEMPERATURA || temperatura>MAXIMA_TEMPERATURA){
                    System.out.println("Temperatura fora do limite.");
                    continue;
                }
                return temperatura;
            }catch(NumberFormatException erro){
                System.out.println("Entrada inválida.");
            }
        }
    }
    public static void exibirTemperatura(double temperatura){
        System.out.println("Temperatura cadastrada: "+temperatura);
    }
}
