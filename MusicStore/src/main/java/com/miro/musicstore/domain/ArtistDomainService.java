package com.miro.musicstore.domain;

import com.miro.musicstore.data.ArtistDAO;
import com.miro.musicstore.data.ArtistDTO;
import com.miro.musicstore.data.ArtistsRepository;
import com.miro.musicstore.exceptions.ArtistNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistDomainService {

    @Autowired
    ArtistsRepository artistsRepository;

    public void addArtist(ArtistDTO artist) {

        ArtistDAO a = new ArtistDAO();

        a.setName(artist.getName());
        a.setAlbums(null);

        artistsRepository.save(a);
    }

    public ArtistDTO getArtist(long id) throws ArtistNotFoundException {

        Optional<ArtistDAO> a = artistsRepository.findById(id);

        if(a.isPresent())
            throw new ArtistNotFoundException();

        ArtistDAO art = a.get();

        return new ArtistDTO(art.getName());
    }

}
