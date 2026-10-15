public class Main {
    public static void main(String[] args) {
        Course course = new Course("java", 1000.0, 1);
        Enrollment enrollment = new Enrollment(course, "Gabriel", 20.0);

        System.out.println("Curso: " + course.getName());
        System.out.println("Valor final: " + enrollment.calculateFinalPrice());
        System.out.println("Vagas: " + course.getAvailableSpots());

        enrollment.confirmEnrollment();

        System.out.println("Vagas: " + course.getAvailableSpots());

        Enrollment enrollment2 = new Enrollment(course, "Raquel", 10.0);
        enrollment2.confirmEnrollment();

        System.out.println("Vagas: " + course.getAvailableSpots());
    }
}