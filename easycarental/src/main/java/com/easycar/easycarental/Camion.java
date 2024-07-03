package com.easycar.easycarental;
import java.time.LocalDate;

import com.easycar.easycarental.VehiculMotori.TypeCarburant;

public class Camion  extends VehiculMotori {
    private double capaciteCharge;

    public Camion(String marque, String modele, String couleur, LocalDate dateAcquisition,
            double prixLocationJournalier, TypeCarburant typeCarburant, double consommationCarburant, boolean aGPS,
            double capaciteCharge) {
        super(marque, modele, couleur, dateAcquisition, prixLocationJournalier, typeCarburant, consommationCarburant,
                aGPS);
        this.capaciteCharge = capaciteCharge;
    }

    public double getCapaciteCharge() {
        return capaciteCharge;
    }

    public void setCapaciteCharge(double capaciteCharge) {
        this.capaciteCharge = capaciteCharge;
    }
    
}

