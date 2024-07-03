package com.easycar.easycarental;

import java.time.LocalDate;

import com.easycar.easycarental.VehiculMotori.TypeCarburant;

public class Voiture extends VehiculMotori {
    public Voiture(String marque, String modele, String couleur, LocalDate dateAcquisition,
            double prixLocationJournalier,
            TypeCarburant typeCarburant, double consommationCarburant, boolean aGPS) {
        super(marque, modele, couleur, dateAcquisition, prixLocationJournalier, typeCarburant,
                consommationCarburant, aGPS);
    }
}
