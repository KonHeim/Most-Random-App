package com.gfa.fedex.controllers;

import com.gfa.fedex.models.advice.Advices;
import com.gfa.fedex.models.advice.Slip;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdviceController {

  @GetMapping("/advice")
  public ResponseEntity getAdvice() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://api.adviceslip.com/advice")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    String foo = obj.getJSONObject("slip").optString("advice");

    Advices advices = new Advices(foo);
    
    return ResponseEntity.status(200).body(advices);
  }
}
