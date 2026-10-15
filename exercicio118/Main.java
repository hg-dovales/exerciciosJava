package exercicio118;

public class Main{
  public static void main(String[] args){
    MovieSession movieSession = new MovieSession("Interestelar", 40.0, 1);
    Ticket ticket = new Ticket(movieSession, "Gabriel", true);
    System.out.println("Filme: " + movieSession.getMovieTitle());
    System.out.println("Valor: " + ticket.calculatePrice());
    System.out.println("Assentos: " + movieSession.getAvailableSeats());
    ticket.confirmPurchase();
    System.out.println("Assentos: " + movieSession.getAvailableSeats());
    Ticket ticket2 = new Ticket(movieSession, "Raquel", false);
    ticket2.confirmPurchase();
    System.out.println("Assentos: " + movieSession.getAvailableSeats());
  }
}
