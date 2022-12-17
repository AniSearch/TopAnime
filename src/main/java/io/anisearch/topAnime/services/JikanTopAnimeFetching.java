package io.anisearch.topAnime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import io.anisearch.topAnime.Repo.UserTA;
import io.anisearch.topAnime.model.topanime;
import net.minidev.json.JSONObject;

public class JikanTopAnimeFetching {
    RestTemplate restTemplate = new RestTemplate();
    @Autowired(required = true)
    private UserTA userTA;
    JSONObjectToArray jota = new JSONObjectToArray();

    public JSONObject firstTwintyFive() {
        JSONObject json = restTemplate.getForObject("https://api.jikan.moe/v4/top/anime", JSONObject.class);
        String jk = json.getAsString("data");
        jk = jk.substring(1, jk.length() - 1);
        jota.JsonObToJsonArray(jk);
        return json;

    }

    public void saveJSON(topanime jk) {
        userTA.save(jk);
    }
}
