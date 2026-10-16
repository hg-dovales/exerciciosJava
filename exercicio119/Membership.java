package exercicio119;

public class Membership {
    private static final double STUDENT_DISCOUNT = 0.15;
    private Gym gym;
    private String memberName;
    private int numberOfMonths;
    private boolean isStudent;
    public Membership(Gym gym, String memberName, int numberOfMonths, boolean isStudent){
        this.gym = gym;
        this.memberName = memberName;
        this.isStudent = isStudent;
        if(numberOfMonths <= 0){
            System.out.println("Quantidade de meses invalida.");
            this.numberOfMonths = 0;
        } else{
            this.numberOfMonths = numberOfMonths;
        }
    }
    double calculateTotal(){
        if(isStudent && numberOfMonths >= 6){
            return (numberOfMonths * gym.getMonthlyFee()) * STUDENT_DISCOUNT;
        } else{
            return numberOfMonths * gym.getMonthlyFee();
        }
    }
    boolean confirmMembership(){
        if(!gym.registerMenber()){
            System.out.println("Não ha vagas disponiveis.");
            return false;
        } else{
            return true;
        }
    }
}
