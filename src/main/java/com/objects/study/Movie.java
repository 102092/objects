package com.objects.study;

import java.time.Duration;

public class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private DiscountPolicy discountPolicy;

  public Movie(String title, Duration runningTime, Money fee,
      DiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  // 좋지 않음. 왜? 할일 정책을 일관적으로 `DisCountPolicy` 에서 결정했는데, 아래 메서드에서 할인 정책이 없을 경우 0원으로 결정해주고 있기 때문에
  public Money calculateMovieFee(Screening screening) {
    if (discountPolicy == null) {
      return fee;
    }
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }

  public Money getFee() {
    return fee;
  }
}
