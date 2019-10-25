package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class YesNo {

  private String answer;
  @JsonIgnore
  private String forced;
  @JsonIgnore
  private String image;

  public YesNo() {
  }

  public YesNo(String answer) {
    this.answer = answer;
  }

  public YesNo(String answer, String image) {
    this.answer = answer;
    this.forced = image;
  }

  public YesNo(String answer, String forced, String image) {
    this.answer = answer;
    this.forced = forced;
    this.image = image;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getForced() {
    return forced;
  }

  public void setForced(String forced) {
    this.forced = forced;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
