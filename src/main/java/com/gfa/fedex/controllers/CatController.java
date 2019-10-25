package com.gfa.fedex.controllers;


import com.gfa.fedex.models.Cats;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

  @GetMapping("/cat")
  public ResponseEntity getCat(Cats cats) throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://aws.random.cat/meow")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Cats cat = new Cats();

    cat.setFile(obj.optString("file"));

    return ResponseEntity.status(200).body(cat);

  }

}
