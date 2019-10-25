package com.gfa.fedex.models.advice;

import java.util.List;

public class Slip {

  private List<Advices> slip;

  public Slip() {
  }

  public Slip(List<Advices> slip) {
    this.slip = slip;
  }

  public List<Advices> getSlip() {
    return slip;
  }

  public void setSlip(List<Advices> slip) {
    this.slip = slip;
  }
}
