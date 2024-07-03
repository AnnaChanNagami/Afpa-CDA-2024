import java.util.Scanner;
public class pyramideIsocele {
    public static void main(String[] args) {
        // On demande à quelqu'un combien de lignes il veut pour son triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de niveaux désiré :");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        // On commence à dessiner le triangle
        int rows = n; // C'est comme la hauteur de notre triangle
        int i = 1; // C'est notre compteur de lignes, on commence à la première ligne
        
        // On commence une boucle pour chaque ligne du triangle
        while (i <= rows) {
            int j = 1; // C'est notre compteur d'étoiles, on commence à la première étoile de chaque ligne
            // Maintenant, on dessine les espaces avant les étoiles pour que notre triangle soit centré
            while (j <= rows - i) {
                System.out.print(" "); // On affiche un espace
                j++; // On passe à l'espace suivant
            }
            // Maintenant, on dessine les étoiles de notre triangle
            j = 1; // On revient au début de la ligne
            while (j <= 2 * i - 1) {
                System.out.print("*"); // On affiche une étoile
                j++; // On passe à l'étoile suivante
            }
            // On passe à la ligne suivante pour dessiner le prochain niveau du triangle
            System.out.println();
            i++; // On passe à la ligne suivante
        }
    }
}