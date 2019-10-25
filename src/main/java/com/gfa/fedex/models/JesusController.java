package com.gfa.fedex.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JesusController {

  @GetMapping("/jesus")
  public ResponseEntity getJesus() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://jesusapi.000webhostapp.com/api/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Jesus jesus = new Jesus(obj.optString("link"));

    return ResponseEntity.status(200).body(jesus);

  }

}
