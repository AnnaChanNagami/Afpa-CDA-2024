import java.util.Random;
import java.util.Scanner;

public class plusOuMoins {

    public static void main(String[] args) {
        System.out.println("Bonjour ! Bienvenue dans le jeu du nombre mystère !");
        
        // On prépare l'ordinateur à écouter ce que l'on va dire
        Scanner scanner = new Scanner(System.in);

        // Instanciation d'un objet de la classe Random qui est aléatoire
        Random r = new Random();

        // Génération d'un nombre >= 0 et < 100
        int nombreMystere = r.nextInt(100);

        int nombreUtilisateur = -1; // Initialisation avec une valeur qui n'est pas dans la plage de 0 à 100

        // Tant que l'utilisateur n'a pas trouvé le nombre mystère
        while (nombreUtilisateur != nombreMystere) {
            System.out.println("Bonjour et bienvenue dans le jeu du nombre mystère !");
            System.out.println("Entrez un nombre entre 0 et 100 :");
            // On écoute la réponse de cette personne
            nombreUtilisateur = Integer.parseInt(scanner.nextLine());

            // On donne des indices à l'utilisateur
            if (nombreUtilisateur < nombreMystere) {
                System.out.println("C'est plus !");
            } else if (nombreUtilisateur > nombreMystere) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le nombre mystère !");
            }
        }

        // Fermeture du scanner après utilisation
        scanner.close();
    }
}

