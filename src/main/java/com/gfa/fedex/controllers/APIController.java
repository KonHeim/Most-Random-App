package com.gfa.fedex.controllers;

import com.gfa.fedex.models.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

  @GetMapping("/activity")
  public ResponseEntity getActivity() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("http://www.boredapi.com/api/activity/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Activity activity = new Activity(obj.optString("activity"));

    return ResponseEntity.status(200).body(activity);
  }

  @GetMapping("/advice")
  public ResponseEntity getAdvice() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://api.adviceslip.com/advice")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    String advice = obj.getJSONObject("slip").optString("advice");

    Advices advices = new Advices(advice);

    return ResponseEntity.status(200).body(advices);
  }

  @GetMapping("/cat")
  public ResponseEntity getCat() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://aws.random.cat/meow")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Cats cat = new Cats(obj.optString("file"));

    return ResponseEntity.status(200).body(cat);

  }

  @GetMapping("/joke")
  public ResponseEntity getRandomJoke() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/random")
            .header("x-rapidapi-host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
            .header("x-rapidapi-key", "ce1784c444mshb12dc6b29482b95p12457ajsn5c2fea8f639b")
            .header("accept", "application/json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    ChuckNorrisJokes chuckNorrisJokes = new ChuckNorrisJokes(obj.optString("value"));

    return ResponseEntity.status(200).body(chuckNorrisJokes);

  }

  @GetMapping("/dog")
  public ResponseEntity getDog() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://random.dog/woof.json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Dogs dog = new Dogs(obj.optString("url"));

    return ResponseEntity.status(200).body(dog);

  }

  @GetMapping("/fox")
  public ResponseEntity getFox() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://randomfox.ca/floof/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Foxes fox = new Foxes(obj.optString("image"));

    return ResponseEntity.status(200).body(fox);

  }

  @GetMapping("/jesus")
  public ResponseEntity getJesus() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://jesusapi.000webhostapp.com/api/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Jesus jesus = new Jesus(obj.optString("link"));

    return ResponseEntity.status(200).body(jesus);

  }

  @GetMapping("/kanye")
  public ResponseEntity getKanyeQuote() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://api.kanye.rest/")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    KanyeQuotes kanyeQuotes = new KanyeQuotes(obj.optString("quote"));

    return ResponseEntity.status(200).body(kanyeQuotes);

  }

  @GetMapping("/number")
  public ResponseEntity getNumber() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("http://numbersapi.com/random?json")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    Numbers number = new Numbers(obj.optString("text"));

    return ResponseEntity.status(200).body(number);

  }

  @GetMapping("/yesno")
  public ResponseEntity getYesNo() throws UnirestException {

    HttpResponse<JsonNode> response = Unirest.get("https://yesno.wtf/api")
            .asJson();

    JSONObject obj = response.getBody().getObject();

    YesNo yesNo = new YesNo(obj.optString("answer"));

    return ResponseEntity.status(200).body(yesNo);

  }

}
