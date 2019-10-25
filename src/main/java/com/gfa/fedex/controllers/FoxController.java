package com.gfa.fedex.controllers;

import com.gfa.fedex.models.Foxes;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoxController {

  @GetMapping("/fox")
  public ResponseEntity getFox() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://randomfox.ca/floof/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Foxes fox = new Foxes(obj.optString("image"));

    return ResponseEntity.status(200).body(fox);

  }

}
