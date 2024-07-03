public class Swaptableau {
    public static void swap(int[] array, int index1, int index2) {
        // Échange des valeurs
        //définition du paramètre temp, arrayind1 et arrayind2
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 2, 9, 4};
        System.out.println("Tableau avant l'échange : " + java.util.Arrays.toString(array));

        // Appel de la méthode swap
        swap(array, 1, 4);

        System.out.println("Tableau après l'échange : " + java.util.Arrays.toString(array));
    }
}

