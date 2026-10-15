package exercicio118;

public class MovieSession{
  private String movieTitle;
  private double ticketPrice;
  private int availableSeats;
  public MovieSession(String movieTitle, double ticketPrice, int availableSeats){
    this.movieTitle = movieTitle;
    if(ticketPrice <= 0.0){
      System.out.println("Preco do ingresso invalido.")
      this.ticketPrice = 0.0;
    } else{
      this.ticketPrice = ticketPrice;
    }
    if(availableSeats < 0){
      System.out.println("Quantidade de acentos invalido.");
      this.availableSeats = 0;
    } else{
      this.availableSeats = availableSeats;
    }
  }
  String getMovieTitle(){
    return movieTitle;
  }
  double getTicketPrice(){
    return ticketPrice;
  }
  int getAvailableSeats(){
    return availableSeats;
  }
  boolean reserveSeat(){
    if(availableSeats < 1){
      retunr false;
    } else{
      availableSeats -= 1;
      return true;
    }
  }
}
