package com.gfa.fedex.controllers;

import com.gfa.fedex.models.YesNo;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YesNoController {

  @GetMapping("/yesno")
  public ResponseEntity getYesNo() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://yesno.wtf/api")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    YesNo yesNo = new YesNo(obj.optString("answer"));

    return ResponseEntity.status(200).body(yesNo);

  }
}
