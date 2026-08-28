public class ConversaoMedida {
    public static void main(String[] args){
        double quilometros = 12.5;
        double metros = converterParaMetros(quilometros);
        double centimetros = converterParaCentimetros(metros);
        exibirDistancias(quilometros, metros, centimetros);
    }
    public static double converterParaMetros(double quilometros){
        double metros = quilometros * 1000;
        return metros;
    }
    public  static double converterParaCentimetros(double metros){
        double centimetros = metros * 100;
        return centimetros;
    }
    public static void exibirDistancias(double quilometros, double metros, double centimetros){
        System.out.println("Quilômetros: " + quilometros);
        System.out.println("Metros: " + metros);
        System.out.println("Centímetros: " + centimetros);
    }
}