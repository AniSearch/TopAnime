package io.anisearch.topAnime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}
