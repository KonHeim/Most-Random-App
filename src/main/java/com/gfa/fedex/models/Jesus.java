package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jesus {

  @JsonProperty(value = "jesusPicLink")
  private String link;

  public Jesus() {
  }

  public Jesus(String link) {
    this.link = link;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }
}
