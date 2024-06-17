import java.util.Scanner;

public class SommeTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier n :");
        // définition du paramètre numérique n 
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        //  définition de la paramètre numérique somme
        int somme = calculerSomme(n);
        System.out.println("La somme des entiers de 0 à " + n + " est : " + somme);
    }

    // Méthode pour calculer la somme des entiers de 0 à n
    public static int calculerSomme(int n) {
    //   initialisation de la fonction somme à 0, paramétrage de i quand i <=n alors i = i+1 et somme = i
        int somme = 0;
        for (int i = 0; i <= n; i++) {
            somme += i;
        }
        return somme;
    }
}