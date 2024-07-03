package com.easycar.easycarental;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Client {
    private String prenom;
    private String nom;
    private String adresse;
    private String ville;
    private String codePostal;
    private List<Reservation> reservations;

    public Client(String prenom, String nom, String adresse, String ville, String codePostal) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.reservations = new ArrayList<>();
    }

    // Getters
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    // Setters
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public boolean supprimerReservation(Reservation reservation) {
        return reservations.remove(reservation);
    }

    public double totalDepenses() {
    //   todo boucle for each
    // comment boucler sur le array list
    // comment je fais la somme 
    double sum = 0.0;
    for (Reservation reservation : reservations) {
        sum += reservation.prixTotal();
    }
    return sum;
    

    }

}
