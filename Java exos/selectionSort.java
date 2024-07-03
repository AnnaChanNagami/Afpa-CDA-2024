public class selectionSort {

    // Méthode principale pour trier un tableau avec le tri par sélection
    public static void selectionSort(int[] array) {
        int n = array.length; // Taille du tableau

        // Parcourir tous les éléments du tableau
        for (int i = 0; i < n - 1; i++) {
            // Trouver l'élément minimum dans le tableau non trié
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Mettre à jour l'indice du minimum
                }
            }

            // Échanger l'élément minimum avec le premier élément non trié
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Méthode principale pour tester le tri par sélection
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11}; // Tableau à trier

        System.out.println("Tableau non trié : ");
        printArray(array);

        selectionSort(array); // Trier le tableau

        System.out.println("Tableau trié : ");
        printArray(array);
    }

    // Méthode pour afficher le tableau
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


