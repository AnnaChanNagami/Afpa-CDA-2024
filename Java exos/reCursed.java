import java.util.Scanner;

public class reCursed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre :");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();

        int resultIterative = calculerFactorielle(n);
        int resultRecursive = calculerRecursive(n);

        System.out.println("La factorielle de " + n + " calculée itérativement est : " + resultIterative);
        System.out.println("La factorielle de " + n + " calculée récursivement est : " + resultRecursive);
    }

    // Méthode pour calculer la factorielle de manière itérative
    public static int calculerFactorielle(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    // Méthode pour calculer la factorielle de manière récursive
    public static int calculerRecursive(int n) {
    //  facto de 0 = 1 et facto de 1 = 1  
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculerRecursive(n - 1);
        }
    }
}
// dans quel cas il faut utiliser la recur plutôt que l'ité ?