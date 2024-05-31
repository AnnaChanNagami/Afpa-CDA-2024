import java.util.Scanner;

// pensez à formater son code ( clic droit Format Docu ou shift + alt + F)
public class MinMax {
    public static void main(String[] args) {
        // classe c'est une boite avec des fonctions mais pas que, Scanner est une
        // classe. majuscule = classe("Scanner"), et une classe par fichier (pour l'instant) => banque outils/fonctions, dans la variable avec minuscule ("scanner") y'a l'objet 
        Scanner scanner = new Scanner(System.in);

        // Ici on a définit les 3 nombres entiers écrit par utili
        System.out.println("Bonjour entrez trois nombres entiers s'il vous plait");


        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        displayMinMax(number1, number2, number3);
        // ici on définit la fonction montre moi min max
        scanner.close();
    }

    public static void displayMinMax(int number1, int number2, int number3) {
        int min = number1;
        int max = number1;
        // on assimile des valeurs à min et max
        if (number2 < min) {
            min = number2;
        }
        if (number2 > max) {
            max = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number3 > max) {
            max = number3;
        }

        // System.out.println ("Le minimum est "); System.out.println (min); =
        // System.out.println("Le minimum est "+ min); gain de place et de temps
        // pk ça prend pas number1 et surtout ça n'affiche que le max T^T

        System.out.println("Le minimum est " + min);
        System.out.println("Le maximum est " + max);
    }
}
