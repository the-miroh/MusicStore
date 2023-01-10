package com.miro.musicstore.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.sql.Date;

@Entity
public class cdDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



}
