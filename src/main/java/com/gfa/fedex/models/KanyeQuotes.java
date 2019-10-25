package com.gfa.fedex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KanyeQuotes {

  @JsonProperty(value = "KanyeQuote")
  private String quote;

  public KanyeQuotes() {
  }

  public KanyeQuotes(String quote) {
    this.quote = quote;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }
}
