import java.util.Scanner;
public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre :");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int facto = calculerFactorielle(n);
        System.out.println("La factorielle de 0 à " + n + " est : " + facto);
    }
    public static int calculerFactorielle(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            // i<=n => point d'arrêt
            // i = 1*2*n ce qu'il doit faire 
            facto *= i;
            // l'action qu'il fait
        }
        return facto;
    }
}