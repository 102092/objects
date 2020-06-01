package com.objects.study;

public class Movie {

  private Money price;

  public Money calculateMovieFee(Screening screening) {
    return screening.getMovie().getPrice();
  }

  public Money getPrice() {
    return price;
  }
}
