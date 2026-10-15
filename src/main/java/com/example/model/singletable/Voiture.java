package com.example.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VOITURE")
public class Voiture extends Vehicule {

    private int nbPortes;

    public Voiture() {}

    public Voiture(String constructeur, int nbPortes) {
        super(constructeur);
        this.nbPortes = nbPortes;
    }

    // getters et setters
    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }
}
