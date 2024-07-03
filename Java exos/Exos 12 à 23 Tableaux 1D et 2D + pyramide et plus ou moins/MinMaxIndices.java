public class MinMaxIndices {
    public static int[] findMinMaxIndices(int[] array) {
        // Bien penser à initialiser les variables sinon ça ne fonctionne pas !
        int minIndex = 0;
        int maxIndex = 0;

        // Parcours du tableau pour trouver les indices du minimum et du maximum
        for (int i = 1; i < array.length; i++) {
            // on initialise i à 1, si i est plus petit que la longueur du tableau alors on ajoute 1 à i
            if (array[i] < array[minIndex]) {
                minIndex = i;
                // si array[i] est inférieur à array[minIndex] alors minIndex est égal à i
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
                // si array[i] est supérieur à array[maxIndex] alors maxIndex est égal à i
            }
        }

        // Retourner un tableau avec l'indice du minimum et l'indice du maximum
        return new int[]{minIndex, maxIndex};
    }

    // ici on crée le tableau de valeurs afin de pouvoir y trouver le min et le max avec l'index
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 2, 9, 4};
        int[] result = findMinMaxIndices(array);
        // on affiche le minimum
        System.out.println("Indice du minimum: " + result[0]);
        System.out.println("Indice du maximum: " + result[1]);
    }
}
