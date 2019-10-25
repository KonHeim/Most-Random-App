package com.gfa.fedex.controllers;

import com.gfa.fedex.models.Activity;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

  @GetMapping("/activity")
  public ResponseEntity getActivity() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("http://www.boredapi.com/api/activity/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Activity activity = new Activity(obj.optString("activity"));

    return ResponseEntity.status(200).body(activity);
  }
}
