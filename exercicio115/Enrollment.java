public class Enrollment {
    private Course course;
    private String student;
    private double discount;

    public Enrollment(Course course, String student, double discount){
        this.course = course;
        this.student = student;

        if(discount < 0.0 || discount > 100.0){
            System.out.println("Desconto invalido.");
            this.discount = 0.0;
        } else{
            this.discount = discount;
        }
    }

    double calculateFinalPrice(){
        return course.getPrice() - (course.getPrice() * (discount / 100));
    }

    boolean confirmEnrollment(){
        if(!course.enroll()){
            System.out.println("Nao ha vagas disponiveis.");
            return false;
        } else{
            return true;
        }
    }
}