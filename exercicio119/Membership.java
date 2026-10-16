package exercicio119;

public class Membership {
    private static final double STUDENT_PRICE_RATE = 0.85;
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
            this.numberOfMonths = 1;
        } else{
            this.numberOfMonths = numberOfMonths;
        }
    }
    double calculateTotal(){
        if(isStudent && numberOfMonths >= 6){
            return (numberOfMonths * gym.getMonthlyFee()) * STUDENT_PRICE_RATE;
        } else{
            return numberOfMonths * gym.getMonthlyFee();
        }
    }
    boolean confirmMembership(){
        if(!gym.registerMember()){
            System.out.println("Não ha vagas disponiveis.");
            return false;
        } else{
            return true;
        }
    }
}
