package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChuckNorrisJokes {

  @JsonProperty(value = "Joke")
  private String value;

  public ChuckNorrisJokes() {
  }

  public ChuckNorrisJokes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
