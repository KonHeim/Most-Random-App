package com.gfa.fedex.controllers;

import com.gfa.fedex.models.Advices;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdviceController {

  @GetMapping("/advice")
  public ResponseEntity getAdvice() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://api.adviceslip.com/advice")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    String advice = obj.getJSONObject("slip").optString("advice");

    Advices advices = new Advices(advice);

    return ResponseEntity.status(200).body(advices);
  }
}
