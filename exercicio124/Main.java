package exercicio124;

public class Main {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 200.0, 1);
        Enrollment enrollment = new Enrollment(onlineCourse, "Gabriel", true, true);
        System.out.println("Curso: " + onlineCourse.getName());
        System.out.println("Valor: " + enrollment.calculateTotal());
        System.out.println("Vagas: " + onlineCourse.getAvailableSpots());
        enrollment.confirmEnrollment();
        System.out.println("Vagas: " + onlineCourse.getAvailableSpots());
        Enrollment enrollment2 = new Enrollment(onlineCourse, "Raquel", false, false);
        enrollment2.confirmEnrollment();
        System.out.println("Vagas: " + onlineCourse.getAvailableSpots());
    }
}
