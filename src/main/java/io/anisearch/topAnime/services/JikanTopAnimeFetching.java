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
        return jota.JsonObToJsonArray(jk, 0);

    }

    // public ArrayList secondTwintyFive() {
    // String url = "http://api.jikan.moe/v4/top/anime?page=2";
    // JSONObject json = restTemplate.getForObject(url, JSONObject.class);
    // String jk = json.toJSONString();
    // return jota.JsonObToJsonArray(jk, 26);

    // }
}
