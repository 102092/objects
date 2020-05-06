package com.objects.study;

public class Bag {

  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public Long hold(Ticket ticket) {
    if(hasInvitation()) {
      setTicket(ticket);
      return 0L;
    } else {
      setTicket(ticket);
      minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  private boolean hasInvitation() {
    return invitation != null;
  }


  private void minusAmount(Long amount) {
    this.amount -= amount;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }
}
