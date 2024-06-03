import java.util.Scanner;

public class SommeTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier n :");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int somme = calculerSomme(n);
        System.out.println("La somme des entiers de 0 à " + n + " est : " + somme);
    }

    // Méthode pour calculer la somme des entiers de 0 à n
    public static int calculerSomme(int n) {
        int somme = 0;
        for (int i = 0; i <= n; i++) {
            somme += i;
        }
        return somme;
    }
}