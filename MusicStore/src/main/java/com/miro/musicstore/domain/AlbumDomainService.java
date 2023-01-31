package com.miro.musicstore.domain;

import com.miro.musicstore.data.AlbumDAO;
import com.miro.musicstore.data.AlbumDTO;
import com.miro.musicstore.data.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumDomainService {

    @Autowired
    private AlbumsRepository albumsRepository;


    public void addAlbum(AlbumDTO album) {

        AlbumDAO a = new AlbumDAO();

        a.setArtist(album.ge);

        albumsRepository.save(new AlbumDAO())

    }

    public AlbumDTO getAlbum() {

        return null;

    }

    public List<AlbumDTO> getAlbums() {
        return null;
    }

    public List<AlbumDTO> getArtistAlbums(String artistName) {

        return null;

    }

}
