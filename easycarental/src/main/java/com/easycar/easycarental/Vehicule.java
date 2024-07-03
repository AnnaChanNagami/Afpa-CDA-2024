package com.easycar.easycarental;

import java.time.LocalDate;

public class Vehicule {
    private String marque;
    private String modele;
    private String couleur;
    private LocalDate dateAcquisition;
    private double prixLocationJournalier;

    public Vehicule(String marque, String modele, String couleur, LocalDate dateAcquisition,
            double prixLocationJournalier) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.dateAcquisition = dateAcquisition;
        this.prixLocationJournalier = prixLocationJournalier;
    }

    // Getters

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public LocalDate getDateAcquisition() {
        return dateAcquisition;
    }

    public double getPrixLocationJournalier() {
        return prixLocationJournalier;
    }

    // Setters
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setDateAcquisition(LocalDate dateAcquisition) {
        this.dateAcquisition = dateAcquisition;
    }

    public void setPrixLocationJournalier(double prixLocationJournalier) {
        this.prixLocationJournalier = prixLocationJournalier;
    }

   
}
