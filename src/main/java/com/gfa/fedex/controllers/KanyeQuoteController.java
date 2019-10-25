package com.gfa.fedex.controllers;

import com.gfa.fedex.models.KanyeQuotes;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KanyeQuoteController {

  @GetMapping("/kanye")
  public ResponseEntity getKanyeQuote() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://api.kanye.rest/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    KanyeQuotes kanyeQuotes = new KanyeQuotes(obj.optString("quote"));

    return ResponseEntity.status(200).body(kanyeQuotes);

  }
}
