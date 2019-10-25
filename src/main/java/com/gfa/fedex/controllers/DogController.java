package com.gfa.fedex.controllers;

import com.gfa.fedex.models.Dogs;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

  @GetMapping("/dog")
  public ResponseEntity getDog() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://random.dog/woof.json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Dogs dog = new Dogs(obj.optString("url"));

    return ResponseEntity.status(200).body(dog);

  }
}
