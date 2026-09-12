public class CalcularArea {
    public static void main(String[] args){
        double base = 10;
        double altura = 5;
        double area = calcularArea(base, altura);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
    public static double calcularArea(double base, double altura){
        double area = base * altura;
        return area;
    }
}