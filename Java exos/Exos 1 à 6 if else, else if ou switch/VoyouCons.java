import java.util.Scanner;

public class VoyouCons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour ! entrez une lettre svp");
        String input = scanner.nextLine();
        if (input.length() > 0) {
            char letter = input.charAt(0);
            letterCheck(letter);
        } else {
            System.out.println("Aucune lettre entrée.");
        }scanner.close();
    }



    public static void letterCheck(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
            System.out.println("C'est une voyelle");
        } else {
            System.out.println("C'est une consonne");

        }
    }
}