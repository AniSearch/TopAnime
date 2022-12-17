package io.anisearch.topAnime.services;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObjectToArray {
    public void JsonObToJsonArray(String json) {
        JSONObject jk = new JSONObject(json);
        JSONArray array = jk.getJSONArray("data");
        System.out.println(array.get(0));
    }
}
