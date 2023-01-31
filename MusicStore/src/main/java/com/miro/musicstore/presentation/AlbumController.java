package com.miro.musicstore.presentation;

import com.miro.musicstore.data.AlbumDTO;
import com.miro.musicstore.domain.AlbumDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController implements AlbumAPI {

    @Autowired


    @Override
    public void addAlbum(AlbumDTO album) {



    }

    @Override
    public AlbumDTO getAlbum(String name) {
        return null;
    }

    @Override
    public List<AlbumDTO> getAlbums() {
        return null;
    }

    @Override
    public List<AlbumDTO> getAlbums(String artistName) {
        return null;
    }

    @Override
    public int removeAlbum(String albumName) {
        return 0;
    }
}
