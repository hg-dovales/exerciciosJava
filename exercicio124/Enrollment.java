package exercicio124;

public class Enrollment {
    private static final double STUDENT_PRICE_RATE = 0.80;
    private static final double CERTIFICATE_PRICE = 50.0;
    private OnlineCourse onlineCourse;
    private String studentName;
    private boolean isStudent;
    private boolean wantsCertificate;
    public Enrollment(
        OnlineCourse onlineCourse, 
        String studentName, 
        boolean isStudent, 
        boolean wantsCertificate){
        this.onlineCourse = onlineCourse;
        this.studentName = studentName;
        this.isStudent = isStudent;
        this.wantsCertificate = wantsCertificate;
    }
    double calculateTotal(){
            double total = onlineCourse.getBasePrice();
            if(isStudent){
                total *= STUDENT_PRICE_RATE;
            }
            if(wantsCertificate){
                total += CERTIFICATE_PRICE;
            }
            return total;
    }
    boolean confirmEnrollment(){
        if(!onlineCourse.enrollStudent()){
            System.out.println("Não há vagas disponíveis.");
            return false;
        } else{
            return true;
        }
    }
}
