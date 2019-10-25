package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Activity {

  private String activity;
  @JsonIgnore
  private double accessibility;
  @JsonIgnore
  private String type;
  @JsonIgnore
  private int participants;
  @JsonIgnore
  private int price;
  @JsonIgnore
  private String link;
  @JsonIgnore
  private String key;

  public Activity() {
  }

  public Activity(String activity) {
    this.activity = activity;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }
}
