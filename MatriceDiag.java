public class MatriceDiag {

    public static void printArray2D(int array2D[][]) {
        // Cette méthode affiche un tableau 2D d'entiers
        for (int hauteur = 0; hauteur < array2D.length; hauteur++) {
            // Parcourt chaque ligne
            for (int largeur = 0; largeur < array2D[hauteur].length; largeur++) {
                // Parcourt chaque colonne dans la ligne actuelle
                System.out.print(array2D[hauteur][largeur] + "\t");
                // Affiche l'élément suivi d'une tabulation
            }
            // Retour à la ligne après chaque ligne pour un meilleur alignement
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Déclare et initialise le tableau 2D
        int[][] array2D = {
            {4, 6, 5, 2},
            {7, 11, 34, 1},
            {28, 6, 2, 15},
            {1, 2, 3, 19},
        };

        // Affiche le tableau 2D
        System.out.println("Matrice initiale :");
        printArray2D(array2D);

        // Inverse les diagonales de la matrice
        invertDiagonals(array2D);

        // Affiche le tableau 2D après l'inversion des diagonales
        System.out.println("Matrice après inversion des diagonales :");
        printArray2D(array2D);

        // Initialise la variable résultat pour la somme des éléments
        int resultat = 0;
        int j = 2; // Nombre de lignes à sommer

        // Boucle à travers les premières 'j' lignes du tableau
        for (int i = 0; i < j; i++) {
            for (int k = 0; k < array2D[i].length; k++) {
                // Additionne les éléments de la ligne actuelle
                resultat += array2D[i][k];
            }
        }

        // Affiche le résultat
        System.out.println("Somme des " + j + " premières lignes : " + resultat);

        // Affiche les diagonales de la matrice et calcule leur somme
        printAndSumDiagonals(array2D);
    }

    public static void printAndSumDiagonals(int[][] array2D) {
        int length = array2D.length;
        int midPoint = (length * 2 - 1) / 2;

        // Parcourt chaque diagonale
        for (int i = 0; i < length * 2 - 1; i++) {
            int itemsInDiagonal = Math.min(i, midPoint) - Math.max(0, i - midPoint) + 1;
            int sumDiagonal = 0; // Initialise la somme de la diagonale courante

            System.out.print("Diagonale " + (i + 1) + ": ");
            
            for (int j = 0; j < itemsInDiagonal; j++) {
                int rowIndex, columnIndex;

                if (i < length) {
                    rowIndex = Math.min(i, length - 1) - j;
                    columnIndex = j;
                } else {
                    rowIndex = length - 1 - j;
                    columnIndex = i - length + 1 + j;
                }

                int value = array2D[rowIndex][columnIndex];
                sumDiagonal += value; // Ajoute l'élément à la somme de la diagonale
                System.out.print(value + " ");
            }
            // Affiche la somme de la diagonale
            System.out.println("- Somme: " + sumDiagonal);
        }
    }

    public static void invertDiagonals(int[][] array2D) {
        int n = array2D.length;
        // Inverse la diagonale principale avec la diagonale opposée
        for (int i = 0; i < n; i++) {
            int temp = array2D[i][i];
            array2D[i][i] = array2D[i][n - i - 1];
            array2D[i][n - i - 1] = temp;
        }
    }
}
