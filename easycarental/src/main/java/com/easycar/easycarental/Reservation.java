package com.easycar.easycarental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private boolean estPayee;
    private Vehicule vehicule;

    public Reservation(LocalDate dateDebut, LocalDate dateFin, boolean estPayee, Vehicule vehicule) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.estPayee = estPayee;
        this.vehicule = vehicule;
    }

    // Getters
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public boolean isEstPayee() {
        return estPayee;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    // Setters
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void setEstPayee(boolean estPayee) {
        this.estPayee = estPayee;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    // Méthode pour calculer le prix total de la réservation
    public double prixTotal() {
        long joursEntre = ChronoUnit.DAYS.between(dateDebut, dateFin);
        return joursEntre * vehicule.getPrixLocationJournalier();
    }
}
