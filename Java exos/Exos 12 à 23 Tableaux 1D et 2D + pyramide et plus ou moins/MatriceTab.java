public class MatriceTab {
        public static void printArray2D(int array2D[][]) {
             // ce int montre késésé  en mode c'est un tableau d'entier naturel
            for (int hauteur = 0; hauteur < array2D.length; hauteur++) {
                // Parcourt chaque ligne
                for (int largeur = 0; largeur < array2D[hauteur].length; largeur++) {
                    // Parcourt chaque colonne dans la ligne actuelle
                    //    \t = retour à la ligne ? (touche tab du clavier) print otut court = pas de retour à la ligne
                    System.out.print(array2D[hauteur][largeur] + "\t");
                    // Affiche l'élément suivi d'une tabulation
                }
               // retour à la ligne pour faire tout bo tout propre
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            // Déclare et initialise le tableau 2D
            int[][] array2D = {
                {4, 6, 5},
                {7, 11, 34},
                {28, 6, 2},
                {1, 2, 3},
                {4, 3, 10}
            };
    
            // Affiche le tableau 2D
            printArray2D(array2D);
    
            // Initialise la variable résultat pour la somme des éléments
            int resultat = 0;
            int j = 5; // Nombre de lignes à sommer
    
            // Boucle à travers les premières 'j' lignes du tableau
            for (int i = 0; i < j; i++) {
                for (int k = 0; k < array2D[i].length; k++) {
                    // Additionne les éléments de la ligne actuelle
                    resultat += array2D[i][k];
                }
            }
    
            // Affiche le résultat
            System.out.println("Somme des " + j + " premières lignes : " + resultat);
        }
    }
    
