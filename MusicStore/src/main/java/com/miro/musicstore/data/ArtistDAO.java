package com.miro.musicstore.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class ArtistDAO {
    @Id
    private Long id;
    private String name;

    private List<AlbumDAO> albums;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlbums(List<AlbumDAO> albums) {
        this.albums = albums;
    }

    @OneToMany(mappedBy="artist")
    public List<AlbumDAO> getAlbums()
    {
        return albums;
    }
}
