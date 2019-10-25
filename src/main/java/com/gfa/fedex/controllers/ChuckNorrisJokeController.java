package com.gfa.fedex.controllers;

import com.gfa.fedex.models.ChuckNorrisJokes;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChuckNorrisJokeController {

  @GetMapping("/joke")
  public ResponseEntity getRandomJoke() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/random")
            .header("x-rapidapi-host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
            .header("x-rapidapi-key", "ce1784c444mshb12dc6b29482b95p12457ajsn5c2fea8f639b")
            .header("accept", "application/json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    ChuckNorrisJokes chuckNorrisJokes = new ChuckNorrisJokes();

    chuckNorrisJokes.setValue(obj.optString("value"));

    return ResponseEntity.status(200).body(chuckNorrisJokes);

  }
}
