package com.example.model.joined;

import javax.persistence.Entity;

@Entity
public class Manager extends Employe {

    private int nbEquipes;

    public Manager() {}

    public Manager(String nomEmploye, int nbEquipes) {
        super(nomEmploye);
        this.nbEquipes = nbEquipes;
    }

    // getters et setters
    public int getNbEquipes() {
        return nbEquipes;
    }

    public void setNbEquipes(int nbEquipes) {
        this.nbEquipes = nbEquipes;
    }
}
