package com.miro.musicstore.presentation;

import com.miro.musicstore.data.AlbumDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/albums")
public interface AlbumAPI {


    @PostMapping
    public void addAlbum(@RequestBody AlbumDTO album);

    @GetMapping("/album")
    public AlbumDTO getAlbum(@RequestBody String name);

    @GetMapping
    public List<AlbumDTO> getAlbums();

    @GetMapping("/name")
    public List<AlbumDTO> getAlbums(@RequestBody String artistName);

    @DeleteMapping
    public int removeAlbum(@RequestBody String albumName);

}
