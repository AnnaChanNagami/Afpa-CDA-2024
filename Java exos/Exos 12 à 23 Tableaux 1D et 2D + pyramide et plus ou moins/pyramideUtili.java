import java.util.Scanner; // On a besoin de ça pour parler à l'ordinateur

public class pyramideUtili { // Notre programme commence ici

    public static void main(String[] args) {
         // C'est là que tout commence

        Scanner scanner = new Scanner(System.in);
         // On prépare l'ordinateur à écouter ce que l'on va dire
        System.out.println("Entrez le nombre de niveaux désiré :");
         // On demande à quelqu'un combien de lignes il veut pour son triangle
        int n = Integer.parseInt(scanner.nextLine());
         // On écoute la réponse de cette personne
        scanner.close(); 
        // On a fini de parler à cette personne, on peut fermer nos oreilles

        int rows = n; 
        // On prend note du nombre de lignes demandées par cette personne
        int i = 1;
         // On commence au premier niveau du triangle

        while (i <= rows) { 
            // On commence à dessiner chaque ligne du triangle
            int j = 1; 
            // On commence avec une étoile sur la première ligne
            while (j <= i) { 
                // On ajoute des étoiles jusqu'à atteindre le nombre d'étoiles sur cette ligne
                System.out.print("* "); 
                // On dessine une étoile suivie d'un espace
                j++; 
                // On passe à l'étoile suivante
            }
            i++; // On passe à la ligne suivante
            System.out.println(); // On saute une ligne pour dessiner la prochaine ligne du triangle
        }
    }
}
