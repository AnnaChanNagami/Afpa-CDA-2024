import java.util.Scanner;

public class AbonnesYtb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demande le nombre d'abonnés
        System.out.println("Entrez votre nombre d'abonnés:");
        int subs = Integer.parseInt(scanner.nextLine());
        
        // Demande le nombre de mois pour le calcul
        System.out.println("Entrez le nombre de mois pour procéder au calcul de l'estimation:");
        int months = Integer.parseInt(scanner.nextLine());
        
        // Ferme le scanner
        scanner.close();
        
        // Appel de la méthode de calcul du nombre d'abonnés
        subscriberCount(subs, months);
    }
    
    public static void subscriberCount(int subs, int months) {
        for (int i = 0; i < months; i++) {
            subs += subs * 0.05;
            System.out.println(" -> Le nombre d'abonnés après " + (i + 1) + " mois: " + subs);
        }
    }
}