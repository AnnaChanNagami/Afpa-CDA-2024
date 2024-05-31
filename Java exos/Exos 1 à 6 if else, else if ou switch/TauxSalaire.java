import java.util.Scanner;

public class TauxSalaire {

    // exercice 3.6 Taux de participation employeur
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour ! entrez votre statut :");
        char status = scanner.nextLine().charAt(0);

        System.out.println("Combien avez-vous d'enfants ? :");
        int enfant = Integer.parseInt(scanner.nextLine());

        System.out.println("Quel est votre salaire? :");
        int salaire = Integer.parseInt(scanner.nextLine());

        tauxEmployeur(status, enfant, salaire);

        scanner.close();
        // Jvais chialer PK YA PAS DE VALEUR TTTT¨TTTT
    }

    public static void tauxEmployeur(char status, int enfant, int salaire) {

        // Ici le ? sert à questionner à savoir si la condition est vraie ou fausse, si
        // c'est vrai, on prend la valeur 1:20, sinon prend la valeur 2:25.
        double taux = (status == 'c') ? 20 : 25;
        final double tauxMax = 50;

        // Majoration par enfant
        for (int i = 0; i < enfant; i++) {
            taux += 15;
            if (taux > tauxMax) {
                taux = tauxMax;
                break;
            }
        }

        // Majoration pour salaire inférieur à 1800€
        if (salaire < 1800) {
            taux += 10;
            if (taux > tauxMax) {
                taux = tauxMax;
            }
        }

        System.out.println(" -> Votre taux s'élève à: " + taux + '%');
    }
}
