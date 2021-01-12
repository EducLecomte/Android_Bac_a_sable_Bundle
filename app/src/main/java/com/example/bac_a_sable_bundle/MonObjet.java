package com.example.bac_a_sable_bundle;

import java.io.Serializable;

public class MonObjet implements Serializable {
    //attribut
    Integer chiffre;
    String chaine;

    public MonObjet(Integer chiffre, String chaine) {
        this.chiffre = chiffre;
        this.chaine = chaine;
    }

    public Integer getChiffre() {
        return chiffre;
    }

    public void setChiffre(Integer chiffre) {
        this.chiffre = chiffre;
    }

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }
}
