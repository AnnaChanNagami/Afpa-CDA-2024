// boucle While 
import java.util.Scanner;

public class TableauNumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier positif:");
        int value = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        // Tableau d'exemple
        int[] array = {1, 2, 3, 4, 5};
        
        // Appel de la méthode de recherche
        int index = searchWhile(array, value);
        System.out.println("Index de la valeur " + value + " : " + index);
    }

    public static int searchWhile(int[] array, int value) {
        int i = 0;
        while (i < array.length); {
            if (array[i] == value) {
                return i; // Retourne l'index si la valeur est trouvée
            }
            i++; // Incrémente i pour passer à l'élément suivant
        }
        return -1; // Retourne -1 si la valeur n'est pas trouvée
    }
}


 
