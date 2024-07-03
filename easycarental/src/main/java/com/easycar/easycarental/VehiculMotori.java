package com.easycar.easycarental;

import java.time.LocalDate;

public abstract class VehiculMotori extends Vehicule {
    public enum TypeCarburant {
        ESSENCE, DIESEL, ELECTRIQUE
    }

    private TypeCarburant typeCarburant;
    private double consommationCarburant;
    private boolean aGPS;

    public VehiculMotori(String marque, String modele, String couleur, LocalDate dateAcquisition,
            double prixLocationJournalier, TypeCarburant typeCarburant, double consommationCarburant,
            boolean aGPS) {
        super(marque, modele, couleur, dateAcquisition, prixLocationJournalier);
        this.typeCarburant = typeCarburant;
        this.consommationCarburant = consommationCarburant;
        this.aGPS = aGPS;
    }

    // Getters
    public TypeCarburant getTypeCarburant() {
        return typeCarburant;
    }

    public double getConsommationCarburant() {
        return consommationCarburant;
    }

    public boolean isAGPS() {
        return aGPS;
    }

    // Setters
    public void setTypeCarburant(TypeCarburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public void setConsommationCarburant(double consommationCarburant) {
        this.consommationCarburant = consommationCarburant;
    }

    public void setAGPS(boolean aGPS) {
        this.aGPS = aGPS;
    }
}
