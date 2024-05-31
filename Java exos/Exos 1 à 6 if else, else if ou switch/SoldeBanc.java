import java.util.Scanner;

public class SoldeBanc {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du solde bancaire à l'utilisateur
        System.out.println("Entrez votre solde bancaire svp");
        int solde = Integer.parseInt(scanner.nextLine());

        // Demande du prix de l'article à l'utilisateur
        System.out.println("Entrez le prix de l'article");
        int prix = Integer.parseInt(scanner.nextLine());

        // Appel de la méthode soldeBanc pour vérifier le solde et le prix
        soldeBanc(solde, prix);

        // Fermeture du scanner
        scanner.close();
    }

    public static void soldeBanc(int solde, int prix) {
        if (solde >= prix) {
            int argent = solde - prix;
            // Affichage du message indiquant que le solde est suffisant
            System.out.println("Le solde est suffisant pour votre achat, il vous restera " + argent + " euros");
        } else {
            int manque = prix - solde;
            // Affichage du message indiquant que le solde est insuffisant
            System.out.println("Le solde est insuffisant pour votre achat, il vous manque " + manque + " euros");
        }
    }
}