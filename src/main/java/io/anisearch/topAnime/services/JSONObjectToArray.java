package io.anisearch.topAnime.services;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import io.anisearch.topAnime.model.topanime;

public class JSONObjectToArray {

    public ArrayList JsonObToJsonArray(String json) {
        JSONObject jk = new JSONObject(json);
        JSONArray array = jk.getJSONArray("data");
        ArrayList<topanime> tp2 = new ArrayList<topanime>();
        for (int i = 0; i < array.length(); i++) {
            JSONObject ob = array.getJSONObject(i);
            topanime tp = new topanime();
            tp.id = i + 1;
            tp.imageurl = ob.getJSONObject("images").getJSONObject("jpg").getString("image_url");
            tp.title = ob.getString("title");
            tp.rating = ob.getDouble("score");
            tp.status = ob.getString("status");
            tp.episodes = ob.getInt("episodes");
            tp.synopsis = ob.getString("synopsis");
            try {
                tp.season = ob.getString("season");
            } catch (Exception e) {
                tp.season = "null";
            }
            tp2.add(tp);
        }
        return tp2;
    }
}
