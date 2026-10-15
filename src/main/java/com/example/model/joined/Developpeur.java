package com.example.model.joined;

import javax.persistence.Entity;

@Entity
public class Developpeur extends Employe {

    private String langagePrincipal;

    public Developpeur() {}

    public Developpeur(String nomEmploye, String langagePrincipal) {
        super(nomEmploye);
        this.langagePrincipal = langagePrincipal;
    }

    // getters et setters
    public String getLangagePrincipal() {
        return langagePrincipal;
    }

    public void setLangagePrincipal(String langagePrincipal) {
        this.langagePrincipal = langagePrincipal;
    }
}
