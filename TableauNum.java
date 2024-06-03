 //Ébauche de code 
 import java.util.Scanner;

 public class TableauNum {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Entrez un entier positif:");
         int value = Integer.parseInt(scanner.nextLine());
         scanner.close();
         
         // Tableau d'exemple
         int[] array = {1, 2, 3, 4, 5};
         
         // Appel de la méthode de recherche
         int index = searchFor(array, value);
         System.out.println("Index de la valeur " + value + " : " + index);
     }
 
     public static int searchFor(int[] array, int value) {
         for (int i = 0; i < array.length; i++) {
             if (array[i] == value) {
                 return i; // Retourne l'index si la valeur est trouvée
             }
         }
         return -1; // Retourne -1 si la valeur n'est pas trouvée
     }
 }
 
