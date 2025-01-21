package com.mzg.bicholist.entities;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "game_year")
    private String year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "platforms")
    private String platforms;

    @Column(name = "score")
    private Double score;


    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "shortDescription", columnDefinition = "TEXT")
    private String shortDescription;

    @Column(name = "longDescription", columnDefinition = "TEXT")
    private String longDescription;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
