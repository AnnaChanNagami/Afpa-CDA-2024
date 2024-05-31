class Main {
    public static void main(String[] args) {
        System.out.println("\nHello World!"); // Display the string.
    }// fin de la fonction "main"
     // fonctione qui affiche en console si la personne est majeure?
     //Parametre d'entree : l'annee de naissance de la personne 
    // Pas de type de retour
public static void displayLegalStatus(int birthYear)
    //recuperer l'annee actuelle 
int currentYear = Year.now().getValue();
    
    // faire soustraction entre annee actuelle et parametre
int age = currentYear  - birthYear;   
    // faire un if pour afficher le bon message 
    if (age>17) {
        System.out.println("Vous etes majeur !");
    } else {
        System.out.println("Vous etes mineur")
    }
    } //fin de la classe "Main"


