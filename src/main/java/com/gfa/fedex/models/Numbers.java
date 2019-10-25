package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Numbers {

  private String text;
  @JsonIgnore
  private long number;
  @JsonIgnore
  private boolean found;
  @JsonIgnore
  private String type;

  public Numbers() {
  }

  public Numbers(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
