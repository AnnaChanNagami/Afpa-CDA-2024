import java.util.Scanner;
public class JoliPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de niveaux désiré :");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        int i = 1;
        while (i <= n) {
            // Imprimer les espaces avant les étoiles
            int j = n - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            // Imprimer les étoiles
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            // Retour à la ligne après chaque niveau de la pyramide
            System.out.println();
            i++;
        }
    }
}
