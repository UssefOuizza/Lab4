package com.example.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MOTO")
public class Moto extends Vehicule {

    private boolean avecSidecar;

    public Moto() {}

    public Moto(String constructeur, boolean avecSidecar) {
        super(constructeur);
        this.avecSidecar = avecSidecar;
    }

    // getters et setters
    public boolean isAvecSidecar() {
        return avecSidecar;
    }

    public boolean getAvecSidecar() {
        return avecSidecar;
    }

    public void setAvecSidecar(boolean avecSidecar) {
        this.avecSidecar = avecSidecar;
    }
}
