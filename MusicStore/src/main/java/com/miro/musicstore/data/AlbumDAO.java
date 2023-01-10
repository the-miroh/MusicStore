package com.miro.musicstore.data;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
public class AlbumDAO {
    @Id
    private Long id;
    private String title;
    private Date releaseDate;++
    private String description;
    private List<SongDAO> songs;


    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription(String description) {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    @OneToMany(mappedBy="album")
    public List<SongDAO> getSongs() {
        return songs;
    }

    public void setSongs(List<SongDAO> songs) {
        this.songs = songs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
