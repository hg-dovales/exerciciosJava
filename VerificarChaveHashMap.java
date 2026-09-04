import java.util.HashMap;

public class VerificarChaveHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> cadastroFuncionario = new HashMap<>();
        cadastroFuncionario.put(1001, "Ana");
        cadastroFuncionario.put(1002, "Carlos");
        cadastroFuncionario.put(1003, "Mariana");
        cadastroFuncionario.put(1004, "Pedro");
        if(cadastroFuncionario.containsKey(1005)){
          System.out.println(cadastroFuncionario.get(1005));
        } else{
            System.out.println("Funcionário não encontrado.");
        }
    }
}
