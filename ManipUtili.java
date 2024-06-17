import java.util.Scanner;
public class ManipUtili {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande à l'utilisateur de définir la taille du tableau
        System.out.println("Entrez la taille du tableau : ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        // Initialise le tableau avec la taille définie par l'utilisateur
        double[] arr = new double[arr_size];

        // Prend les données de l'utilisateur pour les mettre dans un tableau
        System.out.println("Entrez les éléments du tableau: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextDouble()) {
                arr[i] = sc.nextDouble();
            }
        }

        // Affiche les éléments du tableau
        System.out.println("Les éléments du tableau sont: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // Pour une nouvelle ligne après l'affichage des éléments du tableau

        // Appel des méthodes Sum et Average
        double sum = Sum(arr);
        double average = Average(arr);

        // Affichage des résultats
        System.out.println("Somme: " + sum);
        System.out.println("Moyenne: " + average);

        // Convertir le tableau de doubles en tableau d'entiers pour findMinMaxIndices
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = (int) arr[i];
        }

        // Appel de la méthode findMinMaxIndices et affichage des indices
        int[] result = findMinMaxIndices(intArr);
        System.out.println("Indice du minimum: " + result[0]);
        System.out.println("Indice du maximum: " + result[1]);

        sc.close();
    }

    public static double Sum(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    public static double Average(double[] array) {
        double sum = Sum(array);
        return sum / array.length;
    }

    public static int[] findMinMaxIndices(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        // Parcours du tableau pour trouver les indices du minimum et du maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Retourner un tableau avec l'indice du minimum et l'indice du maximum
        return new int[]{minIndex, maxIndex};
    }
}
