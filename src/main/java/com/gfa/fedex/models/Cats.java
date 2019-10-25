package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

  @JsonProperty(value = "catPicLink")
  private String file;

  public Cats() {
  }

  public Cats(String file) {
    this.file = file;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }
}
