package com.gfa.fedex.controllers;

import com.gfa.fedex.models.Numbers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

  @GetMapping("/number")
  public ResponseEntity getNunber() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("http://numbersapi.com/random?json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Numbers number = new Numbers(obj.optString("text"));

    return ResponseEntity.status(200).body(number);

  }

}
