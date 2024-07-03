package com.easycar.easycarental;

import java.time.LocalDate;

public class Velo extends Vehicule {
    public enum Taille {
        S, M, L
    }

    private Taille taille;

    public Velo(String marque, String modele, String couleur, LocalDate dateAcquisition,
            double prixLocationJournalier, Taille taille) {
        super(marque, modele, couleur, dateAcquisition, prixLocationJournalier);
        this.taille = taille;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }
}
