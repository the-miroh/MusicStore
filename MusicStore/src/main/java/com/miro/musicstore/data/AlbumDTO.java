package com.miro.musicstore.data;

import java.util.List;

public class AlbumDTO {

    private String title;
    private String description;
    private String releaseDate;
    private List<SongDTO> songs;
    private Genre genre;
    private ArtistDTO artist;

    public AlbumDTO(ArtistDTO artist, String title, String description, String releaseDate, Genre genre, List<SongDTO> songs) {
        this.artist = artist;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.songs = songs;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(List<SongDTO> songs) {

    }
}
