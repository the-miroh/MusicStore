package com.miro.musicstore.data;

import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<ArtistDAO, Long> {

}
