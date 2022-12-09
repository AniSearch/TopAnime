package io.anisearch.topAnime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.anisearch.topAnime.Repo.UserTA;
import io.anisearch.topAnime.model.topanime;

@RestController
public class ApiController {

    @Autowired(required = true)
    private UserTA userTA;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/getTopAnime")
    public List<topanime> topAnime() {
        return userTA.findAll();
    }
}
