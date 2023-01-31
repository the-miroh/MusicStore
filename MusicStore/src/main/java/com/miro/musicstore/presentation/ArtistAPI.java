package com.miro.musicstore.presentation;

import com.miro.musicstore.data.ArtistDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/artist")
public interface ArtistAPI {

    @PostMapping
    public void addArtist(ArtistDTO artist);

    @GetMapping
    public ArtistDTO getArtist(@PathVariable int id);

}
