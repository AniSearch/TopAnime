package io.anisearch.topAnime.services;

import org.springframework.web.client.RestTemplate;

import net.minidev.json.JSONObject;

public class JikanTopAnime {
    RestTemplate restTemplate = new RestTemplate();

    public JSONObject firstTwintyFive() {
        JSONObject json = restTemplate.getForObject("https://api.jikan.moe/v4/top/anime", JSONObject.class);

        return json;

    }
}
