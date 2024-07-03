public class quickSort {
    // Méthode principale pour trier un tableau avec quicksort
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);  // Trier la partie gauche
            quickSort(array, pivotIndex + 1, end);   // Trier la partie droite
        }
    }

    // Méthode pour diviser le tableau et trouver le pivot
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // Choisir le dernier élément comme pivot
        int i = start - 1; // Plus petit élément

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                // Échanger array[i] et array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Mettre le pivot à sa place
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1; // Retourner l'indice du pivot
    }

    // Méthode principale pour tester le tri rapide
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5}; // Tableau à trier
        System.out.println("Tableau non trié : ");
        printArray(array);

        quickSort(array, 0, array.length - 1); // Trier le tableau

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
    

