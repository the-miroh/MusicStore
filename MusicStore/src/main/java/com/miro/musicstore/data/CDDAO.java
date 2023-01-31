package com.miro.musicstore.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.sql.Date;

@Entity
public class CDDAO extends AlbumDAO{

    private double price;
    private int quantity;
    private boolean isSpecialEdition;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSpecialEdition() {
        return isSpecialEdition;
    }

    public void setSpecialEdition(boolean value) {
        this.isSpecialEdition = value;
    }

}
