package com.easycar.easycarental;

import java.time.LocalDate;


public class App {
	public static void main(String[] args) {
		// Création de véhicules
		Voiture voiture = new Voiture("Toyota", "Corolla", "Rouge", LocalDate.of(2022, 1, 10), 40,
				VehiculMotori.TypeCarburant.ESSENCE, 6.5, true);
		Camion camion = new Camion("Volvo", "FH16", "Bleu", LocalDate.of(2020, 5, 20), 80,
				VehiculMotori.TypeCarburant.DIESEL, 12.0, false, 2000);
		Velo velo = new Velo("Giant", "Escape 3", "Vert", LocalDate.of(2023, 3, 15), 10, Velo.Taille.M);

		// Création de clients
		Client client1 = new Client("John", "Doe", "123 Main St", "Springfield", "12345");

		// Création de réservations
		Reservation reservation1 = new Reservation(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 10), true, voiture);
		Reservation reservation2 = new Reservation(LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 5), true, velo);

		// Ajout des réservations au client
		client1.ajouterReservation(reservation1);
		client1.ajouterReservation(reservation2);

		// Affichage des informations
		System.out.println("Total dépensé par " + client1.getPrenom() + " " + client1.getNom() + ": "
				+ client1.totalDepenses() + " euros.");
	}
}
