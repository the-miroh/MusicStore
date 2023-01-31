package com.miro.musicstore.exceptions;

public class ArtistNotFoundException extends Exception {

    public ArtistNotFoundException() {
        super("There is no artist with the given id");
    }

}
