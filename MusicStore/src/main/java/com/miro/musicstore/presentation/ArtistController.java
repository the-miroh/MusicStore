package com.miro.musicstore.presentation;

import com.miro.musicstore.data.ArtistDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistController implements ArtistAPI {

    @Autowired


    @Override
    public void addArtist(ArtistDTO artist) {

    }

    @Override
    public ArtistDTO getArtist(int id) {
        return null;
    }
}
