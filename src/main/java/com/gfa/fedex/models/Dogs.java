package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dogs {

  @JsonProperty(value = "dogPicLink")
  private String url;

  public Dogs() {
  }

  public Dogs(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
