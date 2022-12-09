package io.anisearch.topAnime.model;

import jakarta.persistence.*;

@Entity
@Table
public class topanime {

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
}


