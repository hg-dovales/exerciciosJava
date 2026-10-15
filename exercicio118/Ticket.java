package exercicio118;

public class Ticket{
  private static final double STUDENT_DISCOUNT = 0.5;
  private MovieSession movieSession;
  private String customerName;
  private boolean isStudent;
  public Ticket(MovieSession movieSession, String customerName, boolean isStudent){
    this.movieSession = movieSession;
    this.customerName = customerName;
    this.isStudent = isStudent;
  }
  double calculatePrice(){
    if(!isStudent){
      return movieSession.getTicketPrice();
    } else{
      return movieSession.getTicketPrice() * STUDENT_DISCOUNT;
    }
  }
  boolean confirmPurchase(){
    if(!movieSession.reserveSeat){
      System.out.println("Não há assentos disponíveis.");
      return false;
    } else {
      return true;
    }
  }
}
