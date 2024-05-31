import java.util.Scanner;

//Le nom du fichier doit être en accord avec la classe !
public class ApprendreScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // ici on ouvre le scanner
        System.out.println("Bonjour ! Entrez votre nom");
        String nom = scanner.nextLine();
        // ici on définit késésé
        System.out.println("Bonjour, " + nom + "!");
        scanner.close();
        // NE PAS OUBLIER DE LE FERMER or else
    }
}