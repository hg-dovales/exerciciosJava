public class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salarioInical){
        this.nome = nome;
        if(salarioInical >= 0.0){
            this.salario = salarioInical;
        } else{
            System.out.println("Salario invalido.");
            this.salario = 0.0;
        }
    }
    String getNome(){
        return nome;
    }
    double getSalario(){
        return salario;
    }
    void aumentarSalario(double percentual){
        if (percentual <= 0.0){
            System.out.println("Percentual de aumento invalido.");
        } else{
            this.salario += this.salario * (percentual/100);
        }
    }
    boolean recebeMaisQue(double valor){
        if(valor < 0.0){
            System.out.println("Valor de comparação invalido.");
            return false;
        } else if( this.salario > valor){
            return true;
        } else{
            return false;
        }
    }
}
