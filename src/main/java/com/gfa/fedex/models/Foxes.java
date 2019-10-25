package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Foxes {

  @JsonProperty(value = "foxPicLink")
  private String image;

  @JsonIgnore
  private String link;

  public Foxes() {
  }

  public Foxes(String image) {
    this.image = image;
  }

  public Foxes(String image, String link) {
    this.image = image;
    this.link = link;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }
}
