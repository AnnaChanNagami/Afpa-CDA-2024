import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello World!"); // Display the string.

        // Exemple d'utilisation de la fonction displayLegalStatus
        int birthYear = 2005; // Remplacer par l'année de naissance souhaitée
        displayLegalStatus(birthYear);
    } // fin de la fonction "main"

    // Fonction qui affiche en console si la personne est majeure
    // Paramètre d'entrée : l'année de naissance de la personne
    // Pas de type de retour
    public static void displayLegalStatus(int birthYear) {
        // Récupérer l'année actuelle
        int currentYear = Year.now().getValue();

        // Faire la soustraction entre l'année actuelle et le paramètre
        int age = currentYear - birthYear;

        // Faire un if pour afficher le bon message
        if (age > 17) {
            System.out.println("Vous êtes majeur !");
        } else {
            System.out.println("Vous êtes mineur !");
        }
    } // fin de la méthode displayLegalStatus
} // fin de la classe Main
