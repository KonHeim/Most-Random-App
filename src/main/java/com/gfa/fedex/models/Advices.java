package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Advices {

  @JsonProperty(value = "Advice")
  private String advice;

  @JsonIgnore
  private String splip_id;

  public Advices() {
  }

  public Advices(String advice) {
    this.advice = advice;
  }

  public Advices(String advice, String splip_id) {
    this.advice = advice;
    this.splip_id = splip_id;
  }

  public String getAdvice() {
    return advice;
  }

  public void setAdvice(String advice) {
    this.advice = advice;
  }

  public String getSplip_id() {
    return splip_id;
  }

  public void setSplip_id(String splip_id) {
    this.splip_id = splip_id;
  }
}
