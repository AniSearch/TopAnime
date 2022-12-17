package io.anisearch.topAnime.services;

import java.util.ArrayList;

import org.springframework.web.client.RestTemplate;

import net.minidev.json.JSONObject;

public class JikanTopAnimeFetching {
    RestTemplate restTemplate = new RestTemplate();

    JSONObjectToArray jota = new JSONObjectToArray();

    public ArrayList firstTwintyFive() {
        JSONObject json = restTemplate.getForObject("https://api.jikan.moe/v4/top/anime", JSONObject.class);
        String jk = json.toJSONString();
        return jota.JsonObToJsonArray(jk);
    }
}
