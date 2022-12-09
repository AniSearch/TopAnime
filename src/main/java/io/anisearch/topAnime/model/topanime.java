package io.anisearch.topAnime.model;

import jakarta.persistence.*;

@Entity
@Table
public class topanime {
    @Id
    @Column
    private int id;

    @Column
    private String imageurl;

    @Column
    private String title;

    @Column
    private double rating;

    @Column
    private String status;

    @Column
    private int episodes;

    @Column
    private String synopsis;

    @Column
    private String season;

    public Integer getId() {
        return id;
    }

    public String getImage() {
        return imageurl;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public String getStatus() {
        return status;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getSeason() {
        return season;
    }
}
