package io.anisearch.topAnime.services;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class JikanTopAnime {
    RestTemplate restTemplate = new RestTemplate();

    public int firstTwintyFive() {
        JSONObject json = restTemplate.getForObject("https://api.jikan.moe/v4/top/anime", JSONObject.class);
        System.out.println(json);
        return 0;

    }
}
