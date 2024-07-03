public class SearchArrayFor {
    public static int searchFor(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Retourne l'index si la valeur est trouvée
            }
        }
        return -1; // Retourne -1 si la valeur n'est pas trouvée
    }
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int value = 3;
        int index = searchFor(array, value);
        System.out.println("Index de la valeur " + value + " : " + index);
    }
}
