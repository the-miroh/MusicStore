package com.miro.musicstore.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.sql.Timestamp;

@Entity
public class SongDAO {
    @Id
    private Long id;
    private String name;
    private int minutes;
    private int seconds;
    private AlbumDAO album;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
    @ManyToOne
    public AlbumDAO getAlbum() {
        return album;
    }

    public void setAlbum(AlbumDAO album) {
        this.album = album;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getDuration() {
        return "" + minutes + ":" + seconds;
    }
}
